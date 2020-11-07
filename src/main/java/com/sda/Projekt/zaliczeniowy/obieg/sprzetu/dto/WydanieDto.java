package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class WydanieDto {

    private long id;
    private long pracId;
    private long sprzetId;
    private String uwagi;
    private String createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPracId() {
        return pracId;
    }

    public void setPracId(long pracId) {
        this.pracId = pracId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public long getSprzetId() {
        return sprzetId;
    }

    public void setSprzetId(long sprzetId) {
        this.sprzetId = sprzetId;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}
