package org.MrDigital.invontery_config.dao;

import org.MrDigital.invontery_config.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product,Long> {
}
