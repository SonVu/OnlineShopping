package com.sonvu.onlineshopping.service;

import com.sonvu.onlineshopping.entity.Category;
import com.sonvu.onlineshopping.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Imperius on 5/20/2014.
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findOne(Integer id) {
        return categoryRepository.findOne(id);
    }
}
