package org.MrDigital.order_config.controller;

import org.MrDigital.order_config.dao.OrderDAO;
import org.MrDigital.order_config.model.Order;
import org.MrDigital.order_config.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("order/actuator/health")
public class HealthCheckController {

    @Autowired
    private OrderDAO commandeRepository;

    @GetMapping
    public Map<String, String> healthCheck() {
        Map<String, String> health = new HashMap<>();
        health.put("status", commandeRepository.count() > 0 ? "UP" : "DOWN");
        return health;
    }
}
