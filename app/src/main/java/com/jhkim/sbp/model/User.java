package com.jhkim.sbp.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    /**
     * 사용자 이름
     */
    public String username;

    /**
     * 사용자 ID
     */
    public String userId;

    /**
     * 사용자 비밀번호
     */
    public String password;

    /**
     * 사용자 이메일
     */
    public String email;

    public User(String username, String userId, String password, String email) {
        this.username = username;
        this.userId = userId;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}