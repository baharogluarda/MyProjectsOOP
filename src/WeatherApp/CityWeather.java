package WeatherApp;

public class CityWeather {
    private String name;
    private Temperature temperature;
    private WeatherCondition weatherCondition;
    private Forecast forecast;

    public CityWeather(String name, Temperature temperature, WeatherCondition weatherCondition) {
        this.name = name;
        this.temperature = temperature;
        this.weatherCondition = weatherCondition;
        this.forecast = new Forecast();
    }

    public String getName() {
        return name;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
}