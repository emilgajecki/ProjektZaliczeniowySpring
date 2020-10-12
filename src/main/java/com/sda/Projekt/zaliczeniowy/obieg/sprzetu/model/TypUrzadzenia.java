package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypUrzadzenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String typUrządzenia;

    public TypUrzadzenia(){

    }

    public TypUrzadzenia(String typUrządzenia) {
        this.typUrządzenia = typUrządzenia;
    }

    public String getTypUrządzenia() {
        return typUrządzenia;
    }

    public void setTypUrządzenia(String typUrządzenia) {
        this.typUrządzenia = typUrządzenia;
    }
}
