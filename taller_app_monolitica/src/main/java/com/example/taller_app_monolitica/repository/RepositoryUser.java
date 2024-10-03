package com.example.taller_app_monolitica.repository;

import com.example.taller_app_monolitica.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, Long> {
    User findByUsernameOrEmailAndPassword(String username, String email, String password);
}
