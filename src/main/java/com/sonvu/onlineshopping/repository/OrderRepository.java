package com.sonvu.onlineshopping.repository;

import com.sonvu.onlineshopping.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Imperius on 5/27/2014.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
