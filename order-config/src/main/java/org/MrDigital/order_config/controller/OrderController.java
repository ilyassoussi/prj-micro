package org.MrDigital.order_config.controller;

import org.MrDigital.order_config.dao.OrderDAO;
import org.MrDigital.order_config.dto.OrderDTO;
import org.MrDigital.order_config.model.Order;
import org.MrDigital.order_config.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("")
    public List<Order> getAll(){
        return orderService.AllOrder();
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> Create(@PathVariable long id, @RequestBody OrderDTO orderDTO){
        return orderService.CreateOrder(id,orderDTO);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        return orderService.deleteOrder(id);
    }
}
