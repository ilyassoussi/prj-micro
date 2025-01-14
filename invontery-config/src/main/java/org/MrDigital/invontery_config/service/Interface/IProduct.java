package org.MrDigital.invontery_config.service.Interface;

import org.MrDigital.invontery_config.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProduct {
    List<Product> getAll();
    Product getById(Long id);
    ResponseEntity<?> CreateProduct(String name , int price , int qte);
}
