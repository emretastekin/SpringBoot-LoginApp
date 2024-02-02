package com.SpringBootProject.SpringBoooot.controller;

import com.SpringBootProject.SpringBoooot.entity.User;
import com.SpringBootProject.SpringBoooot.model.SignupForm;
import com.SpringBootProject.SpringBoooot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/signup")
    public String getSignupPage(){

        return "signup";
    }

    @PostMapping(path="/signup")
    public String submitSignUp(SignupForm signupForm){

        User user=null;

        if(signupForm!=null){

            user= new User(signupForm.getName(),signupForm.getSurname(),signupForm.getEmailId(),signupForm.getPassword());
        }
        userRepository.save(user);

        return "signup-success";
    }

    @GetMapping(path = "/delete/{id}")
    public String deleteUserById(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/signup";
    }
}
