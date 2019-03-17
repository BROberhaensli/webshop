package com.bbw.cfmo.ch.webshop.service;

import com.bbw.cfmo.ch.webshop.model.ShoppingCart;
import com.bbw.cfmo.ch.webshop.repository.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ShoppingCartService {

    private ShoppingCartRepository shoppingCartRepository;

    public Optional<ShoppingCart> getById(Long id) {
        return shoppingCartRepository.findById(id);
    }

    public ShoppingCart save(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

}
