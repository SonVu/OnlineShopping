package com.sonvu.onlineshopping.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

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

    @OneToMany (mappedBy = "order")
    private List<OrderDetail> orderDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
