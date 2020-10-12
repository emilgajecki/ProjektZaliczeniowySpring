package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RolaPracownika {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRole;
    private String role;

    public RolaPracownika(){

    }

    public RolaPracownika(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
