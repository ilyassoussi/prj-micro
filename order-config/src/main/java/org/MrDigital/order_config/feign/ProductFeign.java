package org.MrDigital.order_config.feign;


import org.MrDigital.invontery_config.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name ="inventory-service", fallbackFactory = ProductFeignFallbackFactory.class)

public interface ProductFeign {

    @GetMapping("/product") // <-- OK
    List<Product> getAll();

    @GetMapping("/product/{id}") // <-- OK
    Product getById(@PathVariable("id") Long id);
}

