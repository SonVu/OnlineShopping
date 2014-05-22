package com.sonvu.onlineshopping.controller;

import com.sonvu.onlineshopping.service.CategoryService;
import com.sonvu.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Imperius on 5/15/2014.
 */
@Controller
public class IndexController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String index(ModelMap model) {
        model.addAttribute("topProduct", productService.findTopHits());
        model.addAttribute("topNew", productService.findTopNew());
        model.addAttribute("category", categoryService.findAll());
        return "index";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/sc")
    public String sc(ModelMap model) {
        model.addAttribute("category", categoryService.findAll());
        return "shopping_cart";
    }

    @RequestMapping("/sf")
    public String sf(ModelMap model) {
        model.addAttribute("category", categoryService.findAll());
        return "special_offer";
    }
}
