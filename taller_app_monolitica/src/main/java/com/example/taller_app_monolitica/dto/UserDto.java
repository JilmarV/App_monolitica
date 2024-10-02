package com.example.taller_app_monolitica.dto;

import com.example.taller_app_monolitica.model.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

public class UserDto {

    private String document_num;

    private String first_name;

    private String last_name;

    private String address;

    private String email;

    private String password;

    private String username;

    private List<Product> products;


    public UserDto(String document_num, String first_name, String last_name, String address, String email, String password, String username, List<Product> products) {
        this.document_num = document_num;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
        this.password = password;
        this.username = username;
        this.products = products;
    }

    public UserDto() {
    super();
    }

    public String getDocument_num() {
        return document_num;
    }

    public void setDocument_num(String document_num) {
        this.document_num = document_num;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
