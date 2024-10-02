package com.example.taller_app_monolitica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;

    @Column(name = "sku", unique = true)
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String price;

    @Column(name = "brand")
    private String brand;

    @Column(name = "store")
    private String store;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Product() {
        super();
    }

    public Product(Long id_product, String sku, String name, String price, String brand, String store, User user) {
        this.id_product = id_product;
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.store = store;
        this.user = user;
    }

    public Product(String sku, String name, String price, String brand, String store, User user) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.store = store;
        this.user = user;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
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
