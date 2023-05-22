package pro.sky.springcart2.Services;

import org.springframework.stereotype.Service;
import pro.sky.springcart2.models.Cart;
import pro.sky.springcart2.models.CartItem;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class CartService {
    private static final String CART_SESSION_KEY = "cart";

    public void addItem(int itemId, HttpSession session) {
        Cart cart = getOrCreateCart(session);
        cart.addItem(itemId);
    }

    public List<CartItem> getItems(HttpSession session) {
        return getOrCreateCart(session).getItems();
    }

    private Cart getOrCreateCart(HttpSession session) {
        Cart cart = (Cart) session.getAttribute(CART_SESSION_KEY);
        if (cart == null) {
            cart = new Cart();
            session.setAttribute(CART_SESSION_KEY, cart);
        }
        return cart;
    }
}