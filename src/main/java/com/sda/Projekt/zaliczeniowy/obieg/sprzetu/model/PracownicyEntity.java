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
    private RolaPracownikaEntity pracIdRole;

    @ManyToOne()
    @JoinColumn(name = "deprtmentID")
    private  DzialyEntity pracIdDepartment;



    public PracownicyEntity(){

    }

    public PracownicyEntity(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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

    public RolaPracownikaEntity getPracIdRole() {
        return pracIdRole;
    }

    public void setPracIdRole(RolaPracownikaEntity pracIdRole) {
        this.pracIdRole = pracIdRole;
    }

    public DzialyEntity getPracIdDepartment() {
        return pracIdDepartment;
    }

    public void setPracIdDepartment(DzialyEntity pracIdDeptmewnt) {
        this.pracIdDepartment = pracIdDeptmewnt;
    }
}
