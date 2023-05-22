package pro.sky.springcart2.models;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private final List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(int itemId) {
        CartItem newItem = new CartItem(itemId);
        items.add(newItem);
    }

    public List<CartItem> getItems() {
        return items;
    }
}