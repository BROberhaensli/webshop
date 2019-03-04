package com.bbw.cfmo.ch.webshop.repository;

import com.bbw.cfmo.ch.webshop.model.OrderProduct;
import com.bbw.cfmo.ch.webshop.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
