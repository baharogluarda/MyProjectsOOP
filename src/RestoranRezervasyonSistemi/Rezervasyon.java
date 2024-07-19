package RestoranRezervasyonSistemi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Rezervasyon {

    private int id;
    private Masa masa;
    private Musteri musteri;
    private LocalDate tarih;
    private LocalTime saat;

    public Rezervasyon(int id, Masa masa, Musteri musteri, LocalDate tarih, LocalTime saat) {
        this.id = id;
        this.masa = masa;
        this.musteri = musteri;
        this.tarih = tarih;
        this.saat = saat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Masa getMasa() {
        return masa;
    }

    public void setMasa(Masa masa) {
        this.masa = masa;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public LocalTime getSaat() {
        return saat;
    }

    public void setSaat(LocalTime saat) {
        this.saat = saat;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", masa=" + masa +
                ", musteri=" + musteri +
                ", tarih=" + tarih +
                ", saat=" + saat +
                '}';
    }


}
