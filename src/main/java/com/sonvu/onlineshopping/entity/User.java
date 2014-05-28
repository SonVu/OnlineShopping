package com.sonvu.onlineshopping.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Imperius on 5/18/2014.
 */
@Entity
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;

    @Basic
    @Column (name = "username")
    private String username;

    @Basic
    @Column (name = "password")
    private String password;

    @Basic
    @Column (name = "fullname")
    private String fullname;

    @Basic
    @Column (name = "email")
    private String email;

    @Basic
    @Column (name = "phone")
    private String phone;

    @Basic
    @Column (name = "address")
    private String address;

    @ManyToOne
    @JoinColumn (name = "role")
    private Role userRole;

    @OneToMany (mappedBy = "user")
    private List<Order> orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
