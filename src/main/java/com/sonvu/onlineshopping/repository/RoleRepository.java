package com.sonvu.onlineshopping.repository;

import com.sonvu.onlineshopping.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Imperius on 5/18/2014.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
}
