package pro.sky.springcart2.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(int id) {
        items.add(new CartItem(id));
    }

    public List<CartItem> getItems() {
        return items;
    }
}