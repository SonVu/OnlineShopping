package com.sonvu.onlineshopping.controller;

import com.sonvu.onlineshopping.entity.Product;
import com.sonvu.onlineshopping.service.CategoryService;
import com.sonvu.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Imperius on 5/20/2014.
 */
@Controller
@SessionAttributes({"cart"})
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/product/{id}")
    public String index(ModelMap model, @PathVariable Integer id) {
        if(!model.containsAttribute("cart")) {
            model.addAttribute("cart", new ArrayList<Product>());
        }
        model.addAttribute("product", productService.findOne(id));
        model.addAttribute("category", categoryService.findAll());
        return "product_details";
    }

    @RequestMapping(value = "/product/addProduct", method = RequestMethod.POST)
    public String addProduct(ModelMap model, @ModelAttribute Product product,
                             @ModelAttribute("cart") List<Product> cart) {
        model.addAttribute("p", productService.findOne(7));
        cart.add(product);
        return "redirect:/";
    }
}
