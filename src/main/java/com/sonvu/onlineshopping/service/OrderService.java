package com.sonvu.onlineshopping.service;

import com.sonvu.onlineshopping.entity.Order;
import com.sonvu.onlineshopping.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Imperius on 5/27/2014.
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return  orderRepository.findAll();
    }

    public Page<Order> findAllPage(Pageable pageable){
        return orderRepository.findAll(pageable);
    }

    public Order getOne(Integer id) {
        return orderRepository.getOne(id);
    }

    public Page<Order> findTopNew(){
        PageRequest request = new PageRequest(0,10, Sort.Direction.DESC, "orderedDate");
        return orderRepository.findAll(request);
    }
}
