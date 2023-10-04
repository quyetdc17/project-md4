package com.ra.web.project.model;

public class Order {
    private String oderId;
    private String customerId;
    private String phone;
    private String address;
    private String create;
    private String userId;
    private boolean status;

    public Order() {
    }

    public Order(String oderId, String customerId, String phone,
                 String address, String create, String userId, boolean status) {
        this.oderId = oderId;
        this.customerId = customerId;
        this.phone = phone;
        this.address = address;
        this.create = create;
        this.userId = userId;
        this.status = status;
    }

    public String getOderId() {
        return oderId;
    }

    public void setOderId(String oderId) {
        this.oderId = oderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
