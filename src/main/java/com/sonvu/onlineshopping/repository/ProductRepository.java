package com.sonvu.onlineshopping.repository;

import com.sonvu.onlineshopping.entity.Category;
import com.sonvu.onlineshopping.entity.Product;
import org.jboss.logging.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Imperius on 5/19/2014.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    public Page<Product> findByProductCategory(Category category, Pageable pageable);
}
