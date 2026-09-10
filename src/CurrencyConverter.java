import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("=== CURRENCY CONVERTER ===");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base currency(e.g. USD, EUR, BRL, JPY): ");
        String baseCurrency = scanner.nextLine();

        System.out.println("Enter target currency(e.g. BRL, USD, EUR, GBP): ");
        String targetCurrency = scanner.nextLine();

        System.out.println("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();

        System.out.println("Converting " + baseCurrency + " " + amount + " to " + targetCurrency );

        ExchangeService exchangeService = new ExchangeService();
        double convertedAmount = exchangeService.convert(baseCurrency, targetCurrency, amount);

        System.out.println("Result: " + convertedAmount + " " + targetCurrency);

        String jsonResult = exchangeService.fetchExchangeRates(baseCurrency);
        System.out.println("\nJSON received from internet API:\n" + jsonResult);
    }
}
