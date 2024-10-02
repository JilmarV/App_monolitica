package com.example.taller_app_monolitica.service;

import com.example.taller_app_monolitica.model.Product;
import com.example.taller_app_monolitica.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct {
    @Autowired
    private RepositoryProduct repositoryProduct;

    public List<Product> findAll() {
        return repositoryProduct.findAllById();
    }

    public Product saveProduct(Product product) {
        return repositoryProduct.save(product);
    }

    public void deleteProduct(Long id) {
        repositoryProduct.deleteById(id);
    }
}
