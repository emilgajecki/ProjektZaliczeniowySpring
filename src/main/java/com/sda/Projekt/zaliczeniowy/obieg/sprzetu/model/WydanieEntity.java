package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Wydanie")
public class WydanieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne()
    @JoinColumn(name = "pracID")
    private PracownicyEntity pracId;

    @OneToOne()
    @JoinColumn(name= "sprzetID")
    private SprzetEntity sprzetId;

    private String uwagi;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date dataZwrotu;

    @Column(columnDefinition = "bit default 0")
    private boolean isActive;


    public WydanieEntity(){

    }

    public WydanieEntity(long id, String uwagi) {
        this.id = id;
        this.uwagi = uwagi;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public WydanieEntity(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PracownicyEntity getPracId() {
        return pracId;
    }

    public SprzetEntity getSprzetId() {
        return sprzetId;
    }

    public void setSprzetId(SprzetEntity sprzetId) {
        this.sprzetId = sprzetId;
    }

    public void setPracId(PracownicyEntity pracID) {
        this.pracId = pracID;
    }

    public Date getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(Date dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
