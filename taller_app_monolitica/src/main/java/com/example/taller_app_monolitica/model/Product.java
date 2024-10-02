package com.example.taller_app_monolitica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "price")
    private String price;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Product() {
        super();
    }

    public Product(Long id_product, String name, String quantity, String price, User user) {
        this.id_product = id_product;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.user = user;
    }

    public Product(String name, String quantity, String price, User user) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.user = user;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_user) {
        this.id_product = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
