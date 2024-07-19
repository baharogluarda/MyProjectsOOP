package SimpleInventoryManagementSystem;

public class Warehouse {
    private String name;
    private Location location;
    private Inventory<Item> inventory;

    public Warehouse(String name, Location location) {
        this.name = name;
        this.location = location;
        this.inventory = new Inventory<>();
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public Inventory<Item> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", inventory=" + inventory +
                '}';
    }


}
