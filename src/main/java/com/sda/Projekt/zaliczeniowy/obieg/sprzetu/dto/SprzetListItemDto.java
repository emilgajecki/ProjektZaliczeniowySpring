package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class SprzetListItemDto {

    private long id;
    private String producent;
    private String model;
    private String typUrzadzenia;
    private String serialNumber;
    private String createDate;
    private String uwagi;


    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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

    public String getTypUrzadzenia() {
        return typUrzadzenia;
    }

    public void setTypUrzadzenia(String typUrzadzenia) {
        this.typUrzadzenia = typUrzadzenia;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
