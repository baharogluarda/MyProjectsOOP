package RestoranRezervasyonSistemi;

public class Masa {

    private int id;
    private int kapasite;
    private String durum;

    public Masa(int id, int kapasite, String durum){
        this.id = id;
        this.kapasite = kapasite;
        this.durum = durum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", kapasite=" + kapasite +
                ", durum='" + durum + '\'' +
                '}';
    }

}
