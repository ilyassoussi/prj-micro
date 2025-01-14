package org.MrDigital.order_config.dao;

import org.MrDigital.order_config.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDAO extends JpaRepository<Order,Long> {
}
