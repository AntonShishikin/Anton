import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;
import java.io.StringReader;

public class CbrCurrencyConverter {
    private final String apiUrl;

    public CbrCurrencyConverter(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public double convertCurrency(String targetCurrency, int pointity) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(apiUrl);

            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();

                if (entity != null) {
                    String xmlResponse;
                    try (InputStream is = entity.getContent()) {
                        xmlResponse = EntityUtils.toString(entity);
                    }

                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    Document document = builder.parse(new InputSource(new StringReader(xmlResponse)));

                    XPathFactory xpathFactory = XPathFactory.newInstance();
                    XPath xpath = xpathFactory.newXPath();

                    NodeList currencyNodes = (NodeList) xpath.evaluate("//Valute[CharCode='" + targetCurrency + "']/Value",
                            document, XPathConstants.NODESET);

                    if (currencyNodes.getLength() > 0) {
                        Node node = currencyNodes.item(0);
                        String rateString = node.getTextContent();
                        return pointity*Double.parseDouble(rateString.replace(",", "."));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Ошибка при получении курсов валют из API.");
    }

}

