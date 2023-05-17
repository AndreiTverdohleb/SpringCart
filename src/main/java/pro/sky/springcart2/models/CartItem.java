package pro.sky.springcart2.models;

public class CartItem {
    private long itemId;

    public CartItem(long itemId) {
        this.itemId = itemId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

}
