package stream.streamApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseWriter {
    private Connection connection;

    public DatabaseWriter() throws Exception {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/weatherdb", "user", "password");
    }

    public void writeData(ProcessedData data) {
        CompletableFuture.runAsync(() -> {
            String sql = "INSERT INTO weather (temperature, humidity) VALUES (?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setDouble(1, data.getTemperature());
                stmt.setDouble(2, data.getHumidity());
                stmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
