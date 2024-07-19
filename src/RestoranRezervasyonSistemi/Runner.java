package RestoranRezervasyonSistemi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Runner {
    public static void main(String[] args) {

        RezervasyonYonetim manager = new RezervasyonYonetim();

        Masa masa1 = new Masa(1,4, "Mevcut");
        Masa masa2 = new Masa(2,2, "Mevcut");

        Musteri musteri1 = new Musteri(1, "Ali", "Veli", "555-1234");
        Musteri musteri2 = new Musteri(2, "Ayşe", "Fatma", "555-5678");

        manager.rezervasyonEkle(1, masa1, musteri1, LocalDate.now(), LocalTime.now());
        manager.rezervasyonEkle(2, masa2, musteri2, LocalDate.of(2023, 7, 15), LocalTime.of(19, 0));

        System.out.println("Rezervasyonlar:");
        manager.rezervasyonListele();

        System.out.println("\nAranan Rezervasyon:");
        System.out.println(manager.rezervasyonAra(1));

        manager.rezervasyonGuncelle(1, masa2, musteri2, LocalDate.of(2023, 8, 20), LocalTime.of(20, 0));

        System.out.println("\nGüncellenmiş Rezervasyonlar:");
        manager.rezervasyonListele();

        manager.rezervasyonSil(2);

        System.out.println("\nSilme Sonrası Rezervasyonlar:");
        manager.rezervasyonListele();
    }
}
