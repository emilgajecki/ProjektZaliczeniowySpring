package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class WydanieDto {

    private long id;
    private long sprzetId;
    private long pracoId;
    private String createDate;

    public long getSprzetId() {
        return sprzetId;
    }

    public void setSprzetId(long sprzetId) {
        this.sprzetId = sprzetId;
    }

    public long getPracoId() {
        return pracoId;
    }

    public void setPracoId(long pracoId) {
        this.pracoId = pracoId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
