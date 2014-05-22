package com.sonvu.onlineshopping.controller;

import com.sonvu.onlineshopping.service.ProductService;
import com.sonvu.onlineshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Imperius on 5/18/2014.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/users")
    public String index(Model model) {
        model.addAttribute("a", productService.findTopHits());
        model.addAttribute("userList", userService.findAll());
        model.addAttribute("roleId", userService.findAll().get(0).getUserRole().getId());
        return "users";
    }
}
