package com.transfertjava.demo.controller;

import com.transfertjava.demo.entity.User;
import com.transfertjava.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.JoinColumn;

@RestController // Pour en faire un controller
@CrossOrigin // Pour la sécurity....

public class systemcontroller {

    @PostMapping("/salutation")
    public String salut(){
        return"Bonjour";
    }
    @PostMapping("/test")
    public String prenom(String prenom){
        return prenom;
    }
@Autowired // Instancier une classe avec toutes les dépendances
    UserRepository userRepository;
    @PostMapping("/adduser")
    public User adduser(User user){
        String prenom = user.getPrenom();
        prenom = prenom + " ly";
        user.setPrenom(prenom);
        userRepository.save(user);
        return user;
    }

}
