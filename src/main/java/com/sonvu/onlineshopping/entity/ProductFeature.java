package com.sonvu.onlineshopping.entity;

import javax.persistence.*;
/**
 * Created by Imperius on 5/18/2014.
 */
@Entity
@Table (name = "product_feature")
public class ProductFeature {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;

    @Basic
    @Column (name = "name")
    private String name;

    @Basic
    @Column (name = "value")
    private String value;

    @Basic
    @Column (name = "product_id")
    private Integer productId;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
