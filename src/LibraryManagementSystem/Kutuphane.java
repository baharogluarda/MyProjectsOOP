package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> kitaplar;

    public Kutuphane() {
        kitaplar = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap){
        kitaplar.add(kitap);
        System.out.println("Kitap eklendi : " + kitap);
    }

    public void kitapalriListele() {
        if (kitaplar.isEmpty()){
            System.out.println("Kutuphanede kitap bulunmamaktadir");
        } else {
            System.out.println("Kutuphanedeki kitaplar:");
            for (Kitap kitap : kitaplar){
                System.out.println(kitap);
            }
        }
    }

    public void kitapGuncelle(String isbn, String yeniBaslik, String yeniYazar, int yeniSayfaSayisi){
        for (Kitap kitap : kitaplar){
            if (kitap.getIsbn().equals(isbn)){
                kitap.setBaslik(yeniBaslik);
                kitap.setYazar(yeniYazar);
                kitap.setSayfaSayisi(yeniSayfaSayisi);
                System.out.println("Kitap guncellendi : " + kitap);
                return;
            }
        }
        System.out.println("Kitap bulunamadai : " + isbn);
    }

    public void kitapSilme(String isbn) {
        for (Kitap kitap : kitaplar) {
            if (kitap.getIsbn().equals(isbn)) {
                kitaplar.remove(kitap);
                System.out.println("Kitap silindi: " + kitap);
                return;
            }
        }
        System.out.println("Kitap bulunamadı: " + isbn);
    }

}
