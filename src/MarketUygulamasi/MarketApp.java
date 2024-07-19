package MarketUygulamasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(0, "Domates", 2.10));
        products.add(new Product(1, "Patates", 3.20));
        products.add(new Product(2, "Biber", 1.50));
        products.add(new Product(3, "Soğan", 2.30));
        products.add(new Product(4, "Havuç", 3.10));
        products.add(new Product(5, "Elma", 1.20));
        products.add(new Product(6, "Muz", 1.90));
        products.add(new Product(7, "Çilek", 6.10));
        products.add(new Product(8, "Kavun", 4.30));
        products.add(new Product(9, "Üzüm", 2.70));
        products.add(new Product(10, "Limon", 0.50));

        // Alışveriş sepetini oluştur
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;

        // Alışveriş döngüsü
        while (continueShopping) {

            // Ürün listesini yazdır
            System.out.println("Ürün listesi:");
            for (Product product : products) {
                System.out.println(product);
            }

            // Kullanıcıdan ürün numarası al
            int productId = -1;
            boolean validProductId = false;
            while (!validProductId) {
                System.out.println("Lütfen ürün numarası giriniz:");

                if (scanner.hasNextInt()) {
                    productId = scanner.nextInt();

                    if (productId >= 0 && productId < products.size()) {
                        validProductId = true;
                    } else {
                        System.out.println("Geçersiz ürün numarası. Lütfen tekrar deneyiniz.");
                    }
                } else {
                    System.out.println("Geçersiz giriş. Lütfen yalnızca sayı giriniz.");
                    scanner.next(); // Geçersiz girdiyi temizle
                }
            }

            // Kullanıcıdan miktar al
            double quantity = -1;
            boolean validQuantity = false;
            while (!validQuantity) {
                System.out.println("Kaç kg almak istiyorsunuz? : ");

                if (scanner.hasNextDouble()) {
                    quantity = scanner.nextDouble();

                    if (quantity > 0) {
                        validQuantity = true;
                    } else {
                        System.out.println("Geçersiz miktar. Lütfen tekrar deneyiniz.");
                    }
                } else {
                    System.out.println("Geçersiz giriş. Lütfen geçerli bir miktar giriniz.");
                    scanner.next(); // Geçersiz girdiyi temizle
                }
            }

            // Sepete ürün ekle
            cart.addItem(products.get(productId), quantity);
            cart.printCart();

            // Kullanıcıya başka bir ürün alıp almak istemediğini sor
            //System.out.print("Başka bir ürün almak ister misiniz? (evet/hayir): ");
            //String response = scanner.next();

            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("Baska bir ürün almak istiyormusunuz? Lütfen Evet veya Hayır yaziniz");
                String res = scanner.next();
                if (res.equalsIgnoreCase("Evet")) {
                    validResponse = true;
                } else if (res.equalsIgnoreCase("Hayır")) {
                    continueShopping = false;
                    validResponse = true;
                } else {
                    System.out.println("Geçersiz yanıt, lütfen 'Evet' veya 'Hayır' yazınız.");
                }
            }


        }

        // Toplam fiyatı hesapla
        double totalPrice = cart.getTotalPrice();
        System.out.println("Toplam tutar: " + totalPrice + " TL");

        // Kullanıcıdan ödeme miktarını al
        double payment = -1;
        boolean validPayment = false;
        while(!validPayment){
            System.out.print("Ödeme miktarını giriniz: ");

            if (scanner.hasNextDouble()){
                payment = scanner.nextDouble();

                if (payment >= totalPrice){
                    validPayment = true;
                } else {
                    System.out.println("Yetersiz ödeme. Lütfen tekrar deneyiniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen geçerli bir miktar giriniz.");
                scanner.next(); // Geçersiz girdiyi temizle
            }

        }

        // Ödeme kontrolü ve para üstü hesaplama
        double change = payment - totalPrice;
        System.out.println("Ödemeniz alındı. Para üstünüz: " + change + " TL");

        System.out.println("Teşekkür ederiz!");
        scanner.close();


    }


}
