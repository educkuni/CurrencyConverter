import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeService {
    public double convert(String baseCurrency, String targetCurrency, double amount) {
        String json = fetchExchangeRates(baseCurrency);

        if (json == null) {
            System.out.println("Could not retrieve exchange rates.");
            return 0.0;
        }
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

        JsonObject rates = jsonObject.getAsJsonObject("rates");
        double rate = rates.get(targetCurrency.toUpperCase()).getAsDouble();

        return amount * rate;


    }

    public String fetchExchangeRates(String baseCurrency) {

        String url = "https://open.er-api.com/v6/latest/" + baseCurrency;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            System.out.println("Error fetching rates: " + e.getMessage());
            return null;
        }

    }

}
