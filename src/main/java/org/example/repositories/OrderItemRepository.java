package org.example.repositories;

import org.example.entities.OrderItem;
import org.example.entities.User;
import org.example.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
