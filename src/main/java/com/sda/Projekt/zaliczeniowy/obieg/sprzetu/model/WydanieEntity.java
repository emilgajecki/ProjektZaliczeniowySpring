package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class WydanieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne()
    @JoinColumn(name = "pracID")
    private PracownicyEntity pracId;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    public WydanieEntity(){

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

    public void setPracId(PracownicyEntity pracID) {
        this.pracId = pracID;
    }
}
