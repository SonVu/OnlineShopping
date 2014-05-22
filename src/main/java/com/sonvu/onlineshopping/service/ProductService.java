package com.sonvu.onlineshopping.service;

import com.sonvu.onlineshopping.entity.Category;
import com.sonvu.onlineshopping.entity.Product;
import com.sonvu.onlineshopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Imperius on 5/19/2014.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Page<Product> findAllPage(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public Page<Product> findTopHits(){
        PageRequest request = new PageRequest(0,6, Sort.Direction.DESC, "hits");
        return productRepository.findAll(request);
    }

    public Page<Product> findTopNew(){
        PageRequest request = new PageRequest(0,12, Sort.Direction.DESC, "createdDate");
        return productRepository.findAll(request);
    }

    public Product findOne(Integer id) {
        return productRepository.findOne(id);
    }

    public Page<Product> findByCategoryId(Category category, Pageable pageable) {
        return productRepository.findByProductCategory(category, pageable);
    }
}
