package com.example.taller_app_monolitica.controller;

import ch.qos.logback.core.model.Model;
import com.example.taller_app_monolitica.model.Product;
import com.example.taller_app_monolitica.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Productos")
public class controller_product {

    @Autowired
    private ServiceProduct service_product;


    @GetMapping
    public String listarProductos() {
       service_product.findAll();
       return "productos/list";
    }

    @PostMapping
    public String guardarProducto(Product product, Model model) {
        service_product.saveProduct(product);
        return "redirect:/productos";
    }

    @GetMapping("/eliminar/{id}")
public String eliminar(@PathVariable("id") Long id){
    service_product.deleteProduct(id);
    return "redirect:/productos";
    }
}
