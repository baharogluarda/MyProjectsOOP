package WeatherApp;

import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Bir şehir plaka kodu girin (çıkmak için 0 girin): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Lütfen geçerli bir plaka kodu girin.");
                scanner.next();
                continue;
            }

            int plateCode = scanner.nextInt();
            if (plateCode == 0) {
                System.out.println("Çıkılıyor...");
                break;
            }

            City city = City.getCityByPlateCode(plateCode);
            if (city == null) {
                System.out.println("Geçersiz plaka kodu! Lütfen geçerli bir plaka kodu girin.");
                continue;
            }

            WeatherData weatherData = new WeatherData();
            CityWeather cityWeather = weatherData.getWeather(city);

            System.out.println("---- Hava Durumu ----");
            System.out.println("Şehir: " + cityWeather.getName());
            System.out.println("Sıcaklık: " + cityWeather.getTemperature().getCelsius() + " °C");
            System.out.println("Hava Durumu: " + cityWeather.getWeatherCondition().getCondition());

            System.out.println("5 Günlük Tahmin:");
            for (WeatherCondition condition : cityWeather.getForecast().getForecastList()) {
                System.out.println("- " + condition.getCondition());
            }
        }

        scanner.close();
    }
}