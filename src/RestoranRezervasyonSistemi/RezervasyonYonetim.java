package RestoranRezervasyonSistemi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RezervasyonYonetim {

    private List<Rezervasyon> rezervasyonlar;

    public RezervasyonYonetim() {
        this.rezervasyonlar = new ArrayList<>();
    }

    public void rezervasyonEkle(int id, Masa masa, Musteri musteri, LocalDate tarih, LocalTime saat) {
        Rezervasyon yeniRezervasyon = new Rezervasyon(id, masa, musteri, tarih, saat);
        rezervasyonlar.add(yeniRezervasyon);
    }

    public void rezervasyonSil(int id){
        rezervasyonlar.removeIf(rezervasyon -> rezervasyon.getId() == id);
    }

    public void rezervasyonGuncelle(int id, Masa yeniMasa, Musteri yeniMusteri, LocalDate yeniTarih, LocalTime yeniSaat) {
        for (Rezervasyon reservation : rezervasyonlar) {
            if (reservation.getId() == id) {
                reservation.setMasa(yeniMasa);
                reservation.setMusteri(yeniMusteri);
                reservation.setTarih(yeniTarih);
                reservation.setSaat(yeniSaat);
                break;
            }
        }
    }

    public void rezervasyonListele() {
        for (Rezervasyon reservation : rezervasyonlar) {
            System.out.println(reservation);
        }
    }

    public Rezervasyon rezervasyonAra(int id) {
        for (Rezervasyon reservation : rezervasyonlar) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null; // Rezervasyon bulunamazsa null döner
    }

}
