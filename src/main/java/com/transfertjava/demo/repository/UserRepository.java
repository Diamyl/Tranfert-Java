package com.transfertjava.demo.repository;

import com.transfertjava.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> { // interface "Userrepository" qui hérite de JpaRepository et comme paramètre la classe et le type de l'id

}
