package SimpleInventoryManagementSystem;

import java.util.*;
public class CommandHandler {
    private InventorySystem system;

    public CommandHandler(InventorySystem system) {
        this.system = system;
    }

    public void handleCommands() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Depoları listele");
                System.out.println("2. Depoya ürün ekle");
                System.out.println("3. Depodan ürün ara");
                System.out.println("4. Çıkış");
                System.out.print("Seçiminiz: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    system.listWarehouses();
                } else if (choice == 2) {
                    addProductToWarehouse(scanner);
                } else if (choice == 3) {
                    searchProductInWarehouses(scanner);
                } else if (choice == 4) {
                    System.out.println("Çıkış yapılıyor...");
                    break;
                } else {
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen sayısal bir değer giriniz.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private void addProductToWarehouse(Scanner scanner) {
        try {
            System.out.print("Depo ismi: ");
            String warehouseName = scanner.nextLine();
            Warehouse selectedWarehouse = null;
            for (Warehouse warehouse : system.getWarehouses()) {
                if (warehouse.getName().equalsIgnoreCase(warehouseName)) {
                    selectedWarehouse = warehouse;
                    break;
                }
            }
            if (selectedWarehouse != null) {
                System.out.print("Ürün ismi: ");
                String itemName = scanner.nextLine();

                System.out.print("Ürün id: ");
                int itemId = scanner.nextInt();

                System.out.print("Ürün miktarı: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                Item newItem = new Item(itemName, itemId, quantity);
                selectedWarehouse.getInventory().addItem(newItem);
                System.out.println("Ürün eklendi.");
            } else {
                System.out.println("Depo bulunamadı.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Geçersiz giriş. Lütfen sayısal değer giriniz.");
            scanner.nextLine();
        }
    }

    private void searchProductInWarehouses(Scanner scanner) {
        System.out.print("Aramak istediğiniz ürünün ismi: ");
        String itemName = scanner.nextLine();
        for (Warehouse warehouse : system.getWarehouses()) {
            List<Item> foundItems = warehouse.getInventory().searchItemsByName(itemName);
            if (!foundItems.isEmpty()) {
                System.out.println("Depo: " + warehouse.getName());
                for (Item item : foundItems) {
                    System.out.println(item);
                }
            }
        }
    }
}
