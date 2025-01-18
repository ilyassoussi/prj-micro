package org.MrDigital.order_config.service.Interface;

import org.MrDigital.invontery_config.model.Product;
import org.MrDigital.order_config.dto.OrderDTO;
import org.MrDigital.order_config.model.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IOrder {
    ResponseEntity<?> CreateOrder(Long productID , OrderDTO orderDTO);
    List<Order> AllOrder();
    ResponseEntity<?> deleteOrder(Long id);
}
