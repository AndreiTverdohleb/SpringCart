package pro.sky.springcart2.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.springcart2.models.Cart;
import pro.sky.springcart2.models.CartItem;

import java.util.List;

@Service
public class CartService {
    private final Cart cart;

    @Autowired
    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void addItemToCart(int itemId) {
        cart.addItem(itemId);
    }

    public List<CartItem> getCartItems() {
        return cart.getItems();
    }
}