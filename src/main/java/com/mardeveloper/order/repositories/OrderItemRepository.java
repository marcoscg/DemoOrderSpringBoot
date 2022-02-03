package com.mardeveloper.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mardeveloper.order.entities.OrderItem;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
