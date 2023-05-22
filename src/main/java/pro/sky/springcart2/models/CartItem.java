package pro.sky.springcart2.models;

public class CartItem {
    private int id;

    public CartItem() {
    }

    public CartItem(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}