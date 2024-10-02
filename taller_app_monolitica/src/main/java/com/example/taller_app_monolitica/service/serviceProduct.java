package com.example.taller_app_monolitica.service;

import com.example.taller_app_monolitica.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceProduct {
    @Autowired
    private RepositoryProduct repositoryProduct;

}
