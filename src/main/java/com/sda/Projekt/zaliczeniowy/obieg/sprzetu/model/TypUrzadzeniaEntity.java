package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "typ")
public class TypUrzadzeniaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String typUrządzenia;

    @OneToMany(mappedBy = "sprzetIdTyp")
    private List<SprzetEntity> sprzet;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<SprzetEntity> getSprzet() {
        return sprzet;
    }

    public void setSprzet(List<SprzetEntity> sprzet) {
        this.sprzet = sprzet;
    }
}
