package org.MrDigital.order_config.service;

import org.MrDigital.invontery_config.model.Product;
import org.MrDigital.order_config.Config.ApplicationPropertiesConfiguration;
import org.MrDigital.order_config.dao.OrderDAO;
import org.MrDigital.order_config.feign.ProductFeign;
import org.MrDigital.order_config.model.Order;
import org.MrDigital.order_config.service.Interface.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class OrderService implements IOrder {

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private ProductFeign productFeign;

    @Autowired
    ApplicationPropertiesConfiguration appProperties;

    @Override
    public ResponseEntity<?> CreateOrder(Long productID) {
        Product product1 = productFeign.getById(productID);
        Order order = Order.builder()
                .product(product1.getId())
                .date_creation(new Date())
                .reference("X40AA12"+Math.random()*15 + 1)
                .description("order bien recu")
                .quantite(ThreadLocalRandom.current().nextInt(1, 16))
                .montant(ThreadLocalRandom.current().nextInt(50, 800))
                .build();
        try {
            orderDAO.save(order);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error lors de save");
        }
        return ResponseEntity.ok().body("created order");
    }

    @Override
    public List<Order> AllOrder() {
        List<Order> all = orderDAO.findAll();

        if(all.stream().count() < appProperties.getLimitDeOrder()){
            return all;
        }
        List<Order> listeLimitee = all.subList(0,
                appProperties.getLimitDeOrder());
        return listeLimitee;
    }

    @Override
    public ResponseEntity<?> deleteOrder(Long id) {
        try{
            orderDAO.deleteById(id);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erreur lors de suppression");
        }
        return ResponseEntity.ok("deleted with success");
    }
}
