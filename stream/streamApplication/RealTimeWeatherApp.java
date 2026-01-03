package stream.streamApplication;


    public class RealTimeWeatherApp {
        public static void main(String[] args) throws Exception {
            WeatherDataFetcher fetcher = new WeatherDataFetcher();
            WeatherDataProcessor processor = new WeatherDataProcessor();
            DatabaseWriter dbWriter = new DatabaseWriter();
    
            fetcher.startFetching();
            // Implement logic to pass fetched data to processor and then to dbWriter
        }
    }
    

