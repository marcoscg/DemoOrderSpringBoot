package com.mardeveloper.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mardeveloper.order.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
