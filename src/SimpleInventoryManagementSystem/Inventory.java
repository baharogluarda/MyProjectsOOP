package SimpleInventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory<T> {
    private List<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public List<T> searchItemsByName(String name){
        return items.stream()
                .filter(item -> item instanceof Item && ((Item) item).getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                '}';
    }



}
