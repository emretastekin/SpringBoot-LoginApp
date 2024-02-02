package com.SpringBootProject.SpringBoooot.model;

public class SignupForm {

    private String name;
    private String surname;
    private String emailId;
    private String password;

    public SignupForm(){

        super();
    }

    public SignupForm(String name, String surname, String emailId, String password) {

        super();
        this.name = name;
        this.surname = surname;
        this.emailId = emailId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
