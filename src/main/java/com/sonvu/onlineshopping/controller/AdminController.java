package com.sonvu.onlineshopping.controller;

import com.sonvu.onlineshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Imperius on 5/23/2014.
 */

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }


    @RequestMapping(value = "/admin")
    public String admin() {
        return "admin";
    }
}
