package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studentCode;
    private String name;
    private String phone;
    private String email;
    private String one_time_password;
    private String token;
    private long otpRequestedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOne_time_password() {
        return one_time_password;
    }

    public void setOne_time_password(String one_time_password) {
        this.one_time_password = one_time_password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getOtpRequestedTime() {
        return otpRequestedTime;
    }

    public void setOtpRequestedTime(long otpRequestedTime) {
        this.otpRequestedTime = otpRequestedTime;
    }
}
