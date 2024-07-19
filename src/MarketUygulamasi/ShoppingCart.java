package MarketUygulamasi;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() { // Constructor
        items = new ArrayList<>();
    }

    public void addItem(Product product, double quantity){ //Verilen ürünü ve miktarı alır, bir CartItem nesnesi oluşturur ve bu nesneyi sepetin öğe listesine ekler.
        items.add(new CartItem(product,quantity));
    }

    public void printCart(){ //Sepetteki tüm ürünleri ekrana yazdırır
        System.out.println("Sepetinizdeki urunler:");
        for (CartItem item : items){
            System.out.println(item);
        }
    }

    public double getTotalPrice() { //Sepetteki tüm ürünlerin toplam fiyatını hesaplar
        double total = 0;
        for (CartItem item : items){
            total += item.getTotalPrice();
        }
        return total;
    }

}
