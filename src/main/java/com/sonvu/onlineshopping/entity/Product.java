package com.sonvu.onlineshopping.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Imperius on 5/18/2014.
 */
@Entity
@Table (name = "product")
public class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;

    @Basic
    @Column (name = "name")
    private String name;

    @ManyToOne
    @JoinColumn (name = "category_id")
    private Category productCategory;

    @Basic
    @Column (name = "price")
    private Double price;

    @Basic
    @Column (name = "summary")
    private String summary;

    @Basic
    @Column (name = "tags")
    private String tags;

    @Basic
    @Column (name = "quantity")
    private Integer quantity;

    @Basic
    @Column (name = "hits")
    private Integer hits;

    @Basic
    @Column (name = "createdDate")
    private Date createdDate;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getProductCategory() {
        return productCategory.getId();
    }

    public void setProductCategory(Integer id) {
        Category category = new Category();
        category.setId(id);
        this.productCategory = category;
    }
}
