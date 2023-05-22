package pro.sky.springcart2.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.springcart2.Services.CartService;
import pro.sky.springcart2.models.CartItem;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final CartService cartService;

    @Autowired
    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam("itemId") int itemId, HttpSession session) {
        cartService.addItem(itemId, session);
    }

    @GetMapping("/get")
    public List<CartItem> getCart(HttpSession session) {
        return cartService.getItems(session);
    }
}