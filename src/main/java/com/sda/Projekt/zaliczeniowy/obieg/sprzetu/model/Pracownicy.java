package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pracownicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;
    private int pracIdRole;

    public Pracownicy(){

    }

    public Pracownicy(String name, String lastName, int idRole) {
        this.name = name;
        this.lastName = lastName;
        this.pracIdRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPracIdRole() {
        return pracIdRole;
    }

    public void setPracIdRole(int role) {
        this.pracIdRole = role;
    }
}
