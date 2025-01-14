package org.MrDigital.order_config.feign;

import org.MrDigital.invontery_config.model.Product;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignFallbackFactory implements FallbackFactory<String> {

    @Override
    public String create(Throwable cause) {
        return "Produit par défaut (Fallback)";
    }
}
