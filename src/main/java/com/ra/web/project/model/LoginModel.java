package com.ra.web.project.model;

import javax.validation.constraints.*;

public class LoginModel {
    @NotEmpty(message = "Tài khoản không được bỏ trống!")
    private String username;
    @NotEmpty(message = "Mật khẩu không được bỏ trống!")
    private String password;

    public LoginModel() {
    }

    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
