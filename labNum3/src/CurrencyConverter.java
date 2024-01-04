public class CurrencyConverter {
    private double exchangeRate; // например, курс доллара к евро

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convert(double amount) {
        return amount * exchangeRate;
    }
}
