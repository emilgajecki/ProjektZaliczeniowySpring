package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class WydanieDto {

    private long id;
    private long pracId;
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
}
