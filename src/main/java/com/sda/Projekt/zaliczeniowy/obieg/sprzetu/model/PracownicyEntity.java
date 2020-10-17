package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;

@Entity(name = "pracownicy")
public class PracownicyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;

    @ManyToOne()
    @JoinColumn(name = "rolaID")
    private RolaPracownika pracIdRole;



    public PracownicyEntity(){

    }

    public PracownicyEntity(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setPracIdRole(RolaPracownika pracIdRole) {
        this.pracIdRole = pracIdRole;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public RolaPracownika getPracIdRole() {
        return pracIdRole;
    }
}
