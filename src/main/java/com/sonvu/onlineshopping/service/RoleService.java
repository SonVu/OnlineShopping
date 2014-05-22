package com.sonvu.onlineshopping.service;

import com.sonvu.onlineshopping.entity.Role;
import com.sonvu.onlineshopping.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Imperius on 5/18/2014.
 */
@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
