package MarketUygulamasi;

public class CartItem {
    private Product product;
    private double quantity;

    public CartItem(Product product, double quantity){ // Constructor
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalPrice() { //Urunun toplam fiyatini hesaplar
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.getName() + " - " + quantity + " kg - Toplam: " + getTotalPrice() + " TL";
    }
    //Sepet öğesinin bilgilerini (product name, quantity, total price) düzenli bir formatta string olarak döner. Örneğin, Domates - 2.0 kg - Toplam: 4.20 TL.

}
