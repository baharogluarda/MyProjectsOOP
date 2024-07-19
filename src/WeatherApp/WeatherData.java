package WeatherApp;

public class WeatherData {
    public CityWeather getWeather(City city) {

        Temperature temp = new Temperature(25); // 25 °C
        WeatherCondition condition = new WeatherCondition("Güneşli");
        CityWeather cityWeather = new CityWeather(city.getName(), temp, condition);


        Forecast forecast = new Forecast();
        forecast.addForecast(new WeatherCondition("Parçalı Bulutlu"));
        forecast.addForecast(new WeatherCondition("Yağmurlu"));
        forecast.addForecast(new WeatherCondition("Karla Karışık Yağmur"));
        forecast.addForecast(new WeatherCondition("Rüzgarlı"));
        forecast.addForecast(new WeatherCondition("Açık"));
        cityWeather.setForecast(forecast);

        return cityWeather;
    }
}
