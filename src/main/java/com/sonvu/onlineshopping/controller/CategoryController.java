package com.sonvu.onlineshopping.controller;

import com.sonvu.onlineshopping.entity.Category;
import com.sonvu.onlineshopping.entity.Product;
import com.sonvu.onlineshopping.service.CategoryService;
import com.sonvu.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created by Imperius on 5/20/2014.
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/category/{id}/{pageNumber}")
    public String index(ModelMap model, @PathVariable Integer id, @PathVariable Integer pageNumber) {
        Category category = new Category();
        category.setId(id);
        Page<Product> products = productService.findByCategoryId(category, new PageRequest(pageNumber - 1, 6));
        int current = products.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, products.getTotalPages());
        model.addAttribute("id", id);
        model.addAttribute("category", categoryService.findAll());
        model.addAttribute("products", products);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        return "category";
    }
}
