package com.bbw.cfmo.ch.webshop.repository;

import com.bbw.cfmo.ch.webshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
