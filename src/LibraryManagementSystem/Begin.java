package LibraryManagementSystem;

import java.util.Scanner;

public class Begin {
    public static void begin() {
        Scanner scanner = new Scanner(System.in);
        Kutuphane kutuphane = new Kutuphane();

        while (true){
            System.out.println("\n1. Kitap Ekle");
            System.out.println("2. Kitapları Listele");
            System.out.println("3. Kitap Güncelle");
            System.out.println("4. Kitap Sil");
            System.out.println("5. Çıkış");
            System.out.print("Bir seçenek numarasi girin : ");

            String secimStr = scanner.nextLine();
            int secim = -1;

            try {
                secim = Integer.parseInt(secimStr);
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz seçenek! Lütfen bir sayı girin.");
                continue;
            }

            switch (secim){
                case 1:
                    System.out.print("Başlık: ");
                    String baslik = scanner.nextLine();
                    System.out.print("Yazar: ");
                    String yazar = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Sayfa Sayısı: ");

                    int sayfaSayisi = -1;

                    try {
                        sayfaSayisi = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Geçersiz sayı! Kitap eklenemedi.");
                        break;
                    }

                    Kitap yeniKitap = new Kitap(baslik,yazar,isbn,sayfaSayisi);
                    kutuphane.kitapEkle(yeniKitap);
                    break;

                case 2:
                    kutuphane.kitapalriListele();
                    break;

                case 3:
                    System.out.print("Güncellenecek kitabın ISBN'i: ");
                    String guncellenecekIsbn = scanner.nextLine();
                    System.out.print("Yeni Başlık: ");
                    String yeniBaslik = scanner.nextLine();
                    System.out.print("Yeni Yazar: ");
                    String yeniYazar = scanner.nextLine();
                    System.out.print("Yeni Sayfa Sayısı: ");

                    int yeniSayfaSayisi = -1;

                    try {
                        yeniSayfaSayisi = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Geçersiz sayı! Kitap güncellenemedi.");
                        break; // bir sonraki döngü iterasyonuna geç
                    }

                    kutuphane.kitapGuncelle(guncellenecekIsbn,yeniBaslik,yeniYazar,yeniSayfaSayisi);
                    break;

                case 4:
                    System.out.print("Silinecek kitabın ISBN'i: ");
                    String silinecekIsbn = scanner.nextLine();
                    kutuphane.kitapSilme(silinecekIsbn);
                    break;

                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçenek! Tekrar deneyin.");
                    break;
            }


        }



    }

}
