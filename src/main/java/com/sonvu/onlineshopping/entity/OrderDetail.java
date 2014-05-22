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

    @Basic
    @Column (name = "order_id")
    private Integer orderId;

    @Basic
    @Column (name = "product_id")
    private Integer productId;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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
