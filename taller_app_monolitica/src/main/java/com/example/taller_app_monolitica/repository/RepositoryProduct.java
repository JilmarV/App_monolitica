package com.example.taller_app_monolitica.repository;

import com.example.taller_app_monolitica.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduct extends JpaRepository<Product, Long> {
}
