package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// slowo user zastrdzezone w mssql - slowo klucz - zmieniamy nazwe bazy na inna
@Entity(name = "users")
public class User {

    @Id
    private long id;
    private String name;
    private String password;
    private String role;

    public User(){

    }

    public User(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
