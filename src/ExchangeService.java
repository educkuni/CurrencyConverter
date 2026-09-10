public class ExchangeService {
    public double convert(String baseCurrency, String targetCurrency, double amount) {


        if (baseCurrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("BRL")) {
            return amount * 5.0;
        } else if (baseCurrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR")) {
            return amount * 0.85;
        }

        return amount;

    }
}
