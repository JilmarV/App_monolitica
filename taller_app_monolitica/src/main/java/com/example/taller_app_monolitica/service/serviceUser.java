package com.example.taller_app_monolitica.service;

import com.example.taller_app_monolitica.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class serviceUser {
@Autowired
    private RepositoryUser repositoryUser;

}
