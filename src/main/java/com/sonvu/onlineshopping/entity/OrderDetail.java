package com.sonvu.onlineshopping.entity;

import javax.persistence.*;

/**
 * Created by Imperius on 5/18/2014.
 */
@Entity
@Table (name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn (name = "order_id")
    private Order order;

    @OneToOne
    @JoinColumn (name = "product_id")
    private Product product;

    @Basic
    @Column (name = "quantity")
    private Integer quantity;

    @Basic
    @Column (name = "price")
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
