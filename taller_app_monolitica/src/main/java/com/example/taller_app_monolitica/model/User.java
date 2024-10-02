package com.example.taller_app_monolitica.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phone_number;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<Product> products;

    public User() {
        super();
    }

    public User(Long id_user, String email, String password, String name, String phone_number, List<Product> products) {
        this.id_user = id_user;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone_number = phone_number;
        this.products = products;
    }

    public User(String email, String password, String name, String phone_number, List<Product> products) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone_number = phone_number;
        this.products = products;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
