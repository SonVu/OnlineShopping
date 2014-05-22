package com.sonvu.onlineshopping.entity;

import javax.persistence.*;

/**
 * Created by Imperius on 5/18/2014.
 */
@Entity
@Table (name = "image")
public class Image {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;

    @Basic
    @Column (name = "path")
    private String path;

    @Basic
    @Column (name = "product_id")
    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
