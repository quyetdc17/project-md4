package com.ra.web.project.model;

import org.springframework.context.annotation.Description;

import java.sql.Timestamp;

public class Product {
    private String productId;
    private String productName;
    private String discount;
    private Timestamp timeDiscount;
    private String image;
    private String imageList;
    private String availability;
//    Description
    private String description;
    private String content;
    private String created;
    private boolean status;
    private Manufacturer manufacturerId;
    private Category categoryId;

    public Product() {
    }

    public Product(String productId, String productName, String discount,
                   Timestamp timeDiscount, String image, String imageList, String availability, String description, String content, String created,
                   boolean status, Manufacturer manufacturerId, Category categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.discount = discount;
        this.timeDiscount = timeDiscount;
        this.image = image;
        this.imageList = imageList;
        this.availability = availability;
        this.description = description;
        this.content = content;
        this.created = created;
        this.status = status;
        this.manufacturerId = manufacturerId;
        this.categoryId = categoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Timestamp getTimeDiscount() {
        return timeDiscount;
    }

    public void setTimeDiscount(Timestamp timeDiscount) {
        this.timeDiscount = timeDiscount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageList() {
        return imageList;
    }

    public void setImageList(String imageList) {
        this.imageList = imageList;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Manufacturer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Manufacturer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }
}
