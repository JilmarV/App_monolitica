package com.example.taller_app_monolitica.controller;

import com.example.taller_app_monolitica.model.User;
import com.example.taller_app_monolitica.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class Controller_user {

    @Autowired
    private final ServiceUser serviceUser;

    public Controller_user(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @GetMapping("/user")
    public String listUser(Model model) {
        Model users = model.addAttribute("users", serviceUser.findAll());
        return "list";
    }

    @GetMapping("/new")
    public String ShowFormNewUser(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping
    public String saveUser(User user, Model model) {
        serviceUser.saveUser(user);
        return "redirect:/user/form_product";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(Model model, @PathVariable Long id) {
        serviceUser.deleteUser(id);
        return "redirect:/user/form_product";
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        User user = serviceUser.loginUser(username, email, password);
        if (user != null) {
            // Si el inicio de sesión es exitoso, redirigir a la página de inicio
            return "redirect:/user/form_product";
        } else {
            // Si las credenciales son incorrectas, mostrar un mensaje de error
            model.addAttribute("error", "Nombre de usuario o contraseña incorrectos");
            return "login";
        }
    }
}
