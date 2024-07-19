package SimpleInventoryManagementSystem;

import java.util.List;
import java.util.*;

public class InventorySystem {
    private List<Warehouse> warehouses;

    public InventorySystem() {
        warehouses = new ArrayList<>();
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void listWarehouses() {
        for (Warehouse warehouse : warehouses) {
            System.out.println(warehouse);
        }
    }

    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();
        system.initializeSystem();

        CommandHandler commandHandler = new CommandHandler(system);
        commandHandler.handleCommands();
    }

    private void initializeSystem() {

        Location location1 = new Location("Istanbul", "Turkey");
        Location location2 = new Location("Ankara", "Turkey");


        Warehouse warehouse1 = new Warehouse("Main Warehouse", location1);
        Warehouse warehouse2 = new Warehouse("Secondary Warehouse", location2);


        Item item1 = new Item("Laptop", 101, 10);
        Item item2 = new Item("Smartphone", 102, 5);
        Item item3 = new Item("Television", 103, 7);


        warehouse1.getInventory().addItem(item1);
        warehouse1.getInventory().addItem(item2);
        warehouse2.getInventory().addItem(item3);


        addWarehouse(warehouse1);
        addWarehouse(warehouse2);
    }


}
