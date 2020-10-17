package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RolaPracownika {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRole;
    private String role;

    @OneToMany(mappedBy = "pracIdRole")
    private List<PracownicyEntity> pracownicy;

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public List<PracownicyEntity> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(List<PracownicyEntity> pracownicy) {
        this.pracownicy = pracownicy;
    }

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
