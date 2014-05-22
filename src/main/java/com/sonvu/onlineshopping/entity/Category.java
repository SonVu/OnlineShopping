package com.sonvu.onlineshopping.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Imperius on 5/18/2014.
 */
@Entity
@Table (name = "category")
public class Category {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;

    @Basic
    @Column (name = "name")
    private String name;

    @Basic
    @Column (name = "description")
    private String description;

    @Basic
    @Column (name = "parent_id")
    private  Integer parentId;

    @OneToMany (mappedBy = "productCategory", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
