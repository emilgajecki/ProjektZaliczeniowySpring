package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class SprzetDto {

    private long id;
    private String producent;
    private String model;
    private String serialNumber;
    private long typUrzadzenia;
    private String createDate;

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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getTypUrzadzenia() {
        return typUrzadzenia;
    }

    public void setTypUrzadzenia(long typUrzadzenia) {
        this.typUrzadzenia = typUrzadzenia;
    }
}