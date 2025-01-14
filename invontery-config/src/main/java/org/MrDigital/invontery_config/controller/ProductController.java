package org.MrDigital.invontery_config.controller;

import lombok.extern.slf4j.Slf4j;
import org.MrDigital.invontery_config.dao.ProductDAO;
import org.MrDigital.invontery_config.model.Product;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j

@RestController
@RequestMapping("/product") // <-- Ajout du '/' pour plus de clarté
@RefreshScope
public class ProductController {

    private final ProductDAO productdao;

    public ProductController(ProductDAO productdao) {
        this.productdao = productdao;
    }

    @GetMapping // <-- Appelable par Feign en "/product"
    public List<Product> getAll(){
        return productdao.findAll();
    }

    @GetMapping("/{id}") // <-- Appelable par Feign en "/product/{id}"
    public Product getById(@PathVariable("id") Long id) throws InterruptedException {
        Thread.sleep(5000);
        return productdao.findById(id).orElse(null);
    }
}
