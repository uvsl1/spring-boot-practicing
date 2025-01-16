package com.studying.FirstSpringProject.repositories;

import com.studying.FirstSpringProject.entities.OrderItem;
import com.studying.FirstSpringProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
