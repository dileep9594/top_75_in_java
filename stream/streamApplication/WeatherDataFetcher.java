package stream.streamApplication;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.fasterxml.jackson.databind.ObjectMapper;


public class WeatherDataFetcher {
    private final HttpClient client = HttpClient.newHttpClient();
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void startFetching() {
        Runnable fetchTask = () -> {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.weatherprovider.com/data"))
                .header("Authorization", "Bearer YOUR_API_KEY")
                .build();

            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(this::processData)
                .exceptionally(e -> { e.printStackTrace(); return null; });
        };
        scheduler.scheduleAtFixedRate(fetchTask, 0, 1, TimeUnit.MINUTES);
    }

    private void processData(String jsonData) {
        // Parse and process JSON data
    }
}
