package WeatherApp;

public enum City {
    ISTANBUL(34, "İstanbul"),
    ANKARA(6, "Ankara"),
    IZMIR(35, "İzmir"),
    BURSA(16, "Bursa"),
    ADANA(1, "Adana");

    private final int plateCode;
    private final String name;

    City(int plateCode, String name) {
        this.plateCode = plateCode;
        this.name = name;
    }

    public int getPlateCode() {
        return plateCode;
    }

    public String getName() {
        return name;
    }

    public static City getCityByPlateCode(int plateCode) {
        for (City city : City.values()) {
            if (city.getPlateCode() == plateCode) {
                return city;
            }
        }
        return null;
    }
}