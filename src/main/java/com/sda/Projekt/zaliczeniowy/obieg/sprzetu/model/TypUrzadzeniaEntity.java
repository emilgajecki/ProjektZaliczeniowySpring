package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypUrzadzeniaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String typUrządzenia;

    @OneToMany(mappedBy = "sprzetIdTyp")
    private List<SprzetEntity> sprzet;

    public TypUrzadzeniaEntity(){

    }

    public TypUrzadzeniaEntity(String typUrządzenia) {
        this.typUrządzenia = typUrządzenia;
    }

    public String getTypUrządzenia() {
        return typUrządzenia;
    }

    public void setTypUrządzenia(String typUrządzenia) {
        this.typUrządzenia = typUrządzenia;
    }
}
