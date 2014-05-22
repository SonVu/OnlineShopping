package com.sonvu.onlineshopping.service;

import java.util.List;
import com.sonvu.onlineshopping.entity.User;
import com.sonvu.onlineshopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Imperius on 5/18/2014.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
