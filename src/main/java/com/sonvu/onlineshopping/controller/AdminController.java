package com.sonvu.onlineshopping.controller;

import com.sonvu.onlineshopping.entity.Category;
import com.sonvu.onlineshopping.entity.Product;
import com.sonvu.onlineshopping.service.CategoryService;
import com.sonvu.onlineshopping.service.OrderService;
import com.sonvu.onlineshopping.service.ProductService;
import com.sonvu.onlineshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Imperius on 5/23/2014.
 */

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    public Map<Integer, String> getCategoryList() {
        Map<Integer,String> listCategory = new LinkedHashMap<Integer,String>();
        List<Category> categories = categoryService.findAll();
        listCategory.put(0, "ROOT CATEGORY");
        for (int i = 0; i< categoryService.findAll().size(); i++) {
            if (categories.get(i).getParentId() == 0) {
                listCategory.put(categories.get(i).getId(), categories.get(i).getName());
            }
        }
        return listCategory;
    }

    public Map<Integer, String> getCategoryListForProduct() {
        Map<Integer,String> listCategory = new LinkedHashMap<Integer,String>();
        List<Category> categories = categoryService.findAll();
        for (int i = 0; i< categoryService.findAll().size(); i++) {
            if (categories.get(i).getParentId() != 0) {
                listCategory.put(categories.get(i).getId(), categories.get(i).getName());
            }
        }
        return listCategory;
    }

    @ModelAttribute("category")
    public Category constructCategory() {
        return new Category();
    }

    @ModelAttribute("product")
    public Product constructProduct() {
        return new Product();
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }


    @RequestMapping(value = "/admin")
    public String admin(ModelMap model) {
        model.addAttribute("topOrder", orderService.findTopNew());
        return "admin";
    }

    @RequestMapping(value = "/admin/category")
    public String category(ModelMap model) {
        model.addAttribute("listCategory", categoryService.findAllPage(new PageRequest(0,20)));
        model.addAttribute("listChecked", new ArrayList<Integer>());
        return "admin/category";
    }

    @RequestMapping(value = "/admin/category/insert", method = RequestMethod.POST)
    public String insertCategory(@ModelAttribute("category") Category category, BindingResult result) {
        categoryService.save(category);
        return "redirect:/admin/category";
    }

    @RequestMapping(value = "/admin/category/insert")
    public String insertCategory(ModelMap model) {
        model.addAttribute("listCategory", getCategoryList());
        return "admin/categoryForm";
    }

    @RequestMapping(value = "/admin/category/edit/{id}")
    public String updateCategory(ModelMap model, @PathVariable Integer id) {
        model.addAttribute("listCategory", getCategoryList());
        model.addAttribute("category", categoryService.findOne(id));
        return "admin/categoryForm";
    }

    @RequestMapping(value = "/admin/category/edit/", method = RequestMethod.POST)
    public String updateCategory(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        return "redirect:/admin/category";
    }

    @RequestMapping(value = "/admin/category/delete/{id}")
    public String deleteCategory(ModelMap model, @PathVariable Integer id) {
        categoryService.delete(id);
        return "redirect:/admin/category";
    }








    @RequestMapping(value = "/admin/product")
    public String product(ModelMap model) {
        model.addAttribute("listProduct", productService.findAllPage(new PageRequest(0, 20)));
        return "admin/product";
    }

    @RequestMapping(value = "/admin/product/insert")
    public String insertProduct(ModelMap model) {
        model.addAttribute("listCategory", getCategoryListForProduct());
        return "admin/productForm";
    }

    @RequestMapping(value = "/admin/product/insert", method = RequestMethod.POST)
    public String insertProduct(@ModelAttribute("product") Product product, BindingResult result) {
        productService.save(product);
        return "redirect:/admin/product";
    }

    @RequestMapping(value = "/admin/product/edit/{id}")
    public String updateProduct(ModelMap model, @PathVariable Integer id) {
        model.addAttribute("listCategory", getCategoryListForProduct());
        model.addAttribute("product", productService.findOne(id));
        return "admin/productForm";
    }

    @RequestMapping(value = "/admin/product/delete/{id}")
    public String deleteProduct(ModelMap model, @PathVariable Integer id) {
        productService.delete(id);
        return "redirect:/admin/product";
    }


    @RequestMapping(value = "/admin/order")
    public String order(ModelMap model) {
        model.addAttribute("listOrder", orderService.findAllPage(new PageRequest(0, 20)));
        return "admin/order";
    }
}
