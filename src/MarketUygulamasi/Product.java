package MarketUygulamasi;

public class Product {
    private int id;
    private String name;
    private double price;


    public Product(int id, String name, double price){ // Constructor
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() { //Ürün bilgilerini (id, name, price) düzenli bir formatta string olarak döner. Örneğin, 1 Domates 2.10 TL.
        return id + "  " + name + "  " + price + " TL";
    }

}
