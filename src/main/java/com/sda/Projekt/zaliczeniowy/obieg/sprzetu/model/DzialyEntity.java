package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class DzialyEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepartment;
    private String nameDepartment;

    @OneToMany(mappedBy = "pracIdDepartment")
    private List<PracownicyEntity> pracownicy;

    public long getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(long idDepartment) {
        this.idDepartment = idDepartment;
    }

    public List<PracownicyEntity> getPracownicy() {
        return pracownicy;
    }


    public void setPracownicy(List<PracownicyEntity> pracownicy) {
        this.pracownicy = pracownicy;
    }


    public DzialyEntity() {

    }

    public DzialyEntity(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
}
