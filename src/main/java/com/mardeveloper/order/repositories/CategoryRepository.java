package com.mardeveloper.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mardeveloper.order.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
