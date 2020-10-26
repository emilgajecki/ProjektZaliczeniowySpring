package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class WydanieListDto {

    private long id;
    private String sprzetId;
    private String pracoId;
    private String createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSprzetId() {
        return sprzetId;
    }

    public void setSprzetId(String sprzetId) {
        this.sprzetId = sprzetId;
    }

    public String getPracoId() {
        return pracoId;
    }

    public void setPracoId(String pracoId) {
        this.pracoId = pracoId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
