package stream.streamApplication;

public class WeatherDataProcessor {
    public List<ProcessedData> process(List<RawData> rawDataList) {
        return rawDataList.stream()
            .filter(data -> data.getTemperature() > 0) // Example filter
            .map(data -> new ProcessedData(data.getTemperature(), data.getHumidity()))
            .collect(Collectors.toList());
    }
}