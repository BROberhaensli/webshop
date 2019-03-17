package com.bbw.cfmo.ch.webshop.controller;

import com.bbw.cfmo.ch.webshop.model.ShoppingCart;
import com.bbw.cfmo.ch.webshop.service.ShoppingCartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shoppingcart")
@AllArgsConstructor
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    @GetMapping("/{id}")
    ShoppingCart getById(@PathVariable Long id) {
        return shoppingCartService.getById(id).orElse(null);
    }

    @PutMapping("/{id}")
    ShoppingCart putShoppingCart(@RequestBody ShoppingCart newShoppingCart, @PathVariable Long id) {

        return shoppingCartService.getById(id)
                .map(cart -> {
                    cart.setProductList(newShoppingCart.getProductList());
                    return shoppingCartService.save(cart);
                })
                .orElseGet(() -> {
                    newShoppingCart.setId(id);
                    return shoppingCartService.save(newShoppingCart);
                });
    }

}
