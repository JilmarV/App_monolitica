package com.example.taller_app_monolitica.dto;

import com.example.taller_app_monolitica.model.User;

public class ProducDto {

    private String sku;

    private String name;

    private String price;

    private String brand;

    private String store;

    private User user;

    public ProducDto() {
    super();
    }

    public ProducDto(String sku, String name, String price, String brand, String store, User user) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.store = store;
        this.user = user;
    }


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
