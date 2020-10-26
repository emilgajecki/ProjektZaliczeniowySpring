package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SprzetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String producent;
    private String model;
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "sprzetID")
    private TypUrzadzeniaEntity sprzetIdTyp;

    @OneToOne
    @JoinColumn(name = "sprzetIdWydanie")
    private WydanieEntity wydanieId;


    @Temporal(TemporalType.DATE)
    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public SprzetEntity(){

    }

    public SprzetEntity(String producent, String model, String serialNumber) {
        this.producent = producent;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public TypUrzadzeniaEntity getSprzetIdTyp() {
        return sprzetIdTyp;
    }

    public void setSprzetIdTyp(TypUrzadzeniaEntity sprzetIdTyp) {
        this.sprzetIdTyp = sprzetIdTyp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public WydanieEntity getWydanieId() {
        return wydanieId;
    }

    public void setWydanieId(WydanieEntity wydanieId) {
        this.wydanieId = wydanieId;
    }
}
