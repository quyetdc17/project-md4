package com.ra.web.project.model;

import java.sql.Timestamp;

public class User {
    private String userId;
    private String username;
    private String email;
    private String phone;
    private Timestamp birthday;
    private String address;
    private boolean gender;
    private String password;
    private boolean status;

    public User() {
    }

    public User(String userId, String username, String email, String phone,
                Timestamp birthday, String address, boolean gender,
                String password, boolean status) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.status = status;
    }

    public User(String uuid1, String aDefault, String mail, String number, int i, String tokyo, boolean gender, String number1, boolean status) {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
