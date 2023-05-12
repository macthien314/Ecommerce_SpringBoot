package com.ecommerce.library.service;

import com.ecommerce.library.model.ShoppingCart;
import org.springframework.stereotype.Service;


public interface OrderService {
    void saveOrder(ShoppingCart cart);
    void acceptOrder(Long id);
    void cancelOrder(Long id);

}
