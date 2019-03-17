package com.bbw.cfmo.ch.webshop.repository;

import com.bbw.cfmo.ch.webshop.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
