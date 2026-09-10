import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("=== CURRENCY CONVERTER ===");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base currency(EUR)(USD)(BRL): ");
        String baseCurrency = scanner.nextLine();

        System.out.println("Enter target currency(EUR)(USD)(BRL): ");
        String targetCurrency = scanner.nextLine();

        System.out.println("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();

        System.out.println("Converting " + baseCurrency + " " + amount + " to " + targetCurrency );

        ExchangeService exchangeService = new ExchangeService();
        double convertedAmount = exchangeService.convert(baseCurrency, targetCurrency, amount);

        System.out.println("Result: " + convertedAmount + " " + targetCurrency);
    }
}
