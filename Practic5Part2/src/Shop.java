import Implements.Printable;

import java.util.List;

public class Shop implements Printable {
    private List<Printable> productsList;

    Shop(List<Printable> productsList) {
        this.productsList = productsList;
    }

    @Override
    public void print() {
        for (Printable product : productsList) {
            product.print();
        }
    }

//    public Printable findProductByName(String name) {
//        for (Printable product : productsList) {
//            if (product.print() == name) {
//                return product;
//            }
//        }
//        return null;
//    }
}
