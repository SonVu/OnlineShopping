package com.sonvu.onlineshopping.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Imperius on 5/18/2014.
 */
@Entity
@Table (name = "order")
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;

    @Basic
    @Column (name = "user_id")
    private Integer userId;

    @Basic
    @Column (name = "status")
    private String status;

    @Basic
    @Column (name = "shippers_name")
    private String shipper;

    @Basic
    @Column (name = "address")
    private String address;

    @Basic
    @Column (name = "phone")
    private String phone;

    @Basic
    @Column (name = "ordered_on")
    private Date orderedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }
}
