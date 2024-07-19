package WeatherApp;

import java.util.ArrayList;

public class Forecast {
    private ArrayList<WeatherCondition> forecastList;

    public Forecast(){
        forecastList = new ArrayList<>();
    }

    public void addForecast(WeatherCondition condition) {
        forecastList.add(condition);
    }

    public ArrayList<WeatherCondition> getForecastList() {
        return forecastList;
    }
}