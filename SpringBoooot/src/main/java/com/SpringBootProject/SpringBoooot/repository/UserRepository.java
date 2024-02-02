package com.SpringBootProject.SpringBoooot.repository;

import com.SpringBootProject.SpringBoooot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

}
