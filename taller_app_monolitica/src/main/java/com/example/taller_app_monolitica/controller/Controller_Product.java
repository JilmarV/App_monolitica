package com.example.taller_app_monolitica.controller;

import org.springframework.ui.Model;
import com.example.taller_app_monolitica.model.Product;
import com.example.taller_app_monolitica.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Products")
public class Controller_Product {

    @Autowired
    private ServiceProduct service_product;

    @GetMapping
    public String listProduct(Model model) {
         Model products = model.addAttribute("products", service_product.findAll());
        return "products/list";
    }

    @PostMapping
    public String saveProduct(Product product, Model model) {
        service_product.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        service_product.deleteProduct(id);
        return "redirect:/products";
    }
}
