package RestoranRezervasyonSistemi;

public class Musteri {

    private int id;
    private String isim;
    private String soyisim;
    private String telefon;


    public Musteri(int id, String isim, String soyisim, String telefon) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

}
