package com.mardeveloper.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mardeveloper.order.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
