package org.MrDigital.invontery_config.service;

import org.MrDigital.invontery_config.dao.ProductDAO;
import org.MrDigital.invontery_config.model.Product;
import org.MrDigital.invontery_config.service.Interface.IProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProduct {
    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getAll(){
        return productDAO.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productDAO.findById(id).get();
    }

    @Override
    public ResponseEntity<?> CreateProduct(String name, int price, int qte) {
        return null;
    }
}
