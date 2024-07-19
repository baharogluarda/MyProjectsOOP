package SimpleInventoryManagementSystem;

public class Item {
    private String name;
    private int id;
    private int quantity;

    public Item(String name, int id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
