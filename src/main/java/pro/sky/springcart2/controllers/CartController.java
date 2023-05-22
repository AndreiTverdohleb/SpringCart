package pro.sky.springcart2.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.springcart2.Services.CartService;
import pro.sky.springcart2.models.CartItem;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addItemToCart(@RequestParam("itemId") int itemId) {
        cartService.addItemToCart(itemId);
    }

    @GetMapping("/get")
    public List<CartItem> getCartItems() {
        return cartService.getCartItems();
    }
}