package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class WydanieListItemDto {

    private long id;
    private String imiePracownika;
    private String nazwaPracownika;
    private String dzialPracownika;
    private String producnetSprzetu;
    private String modelSprzetu;
    private String serialNumber;
    private String uwagi;
    private String createDate;
    private String dataZwrotu;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwaPracownika() {
        return nazwaPracownika;
    }

    public void setNazwaPracownika(String nazwaPracownika) {
        this.nazwaPracownika = nazwaPracownika;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public String getImiePracownika() {
        return imiePracownika;
    }

    public void setImiePracownika(String imiePracownika) {
        this.imiePracownika = imiePracownika;
    }

    public String getProducnetSprzetu() {
        return producnetSprzetu;
    }

    public void setProducnetSprzetu(String producnetSprzetu) {
        this.producnetSprzetu = producnetSprzetu;
    }

    public String getModelSprzetu() {
        return modelSprzetu;
    }

    public void setModelSprzetu(String modelSprzetu) {
        this.modelSprzetu = modelSprzetu;
    }

    public String getDzialPracownika() {
        return dzialPracownika;
    }

    public void setDzialPracownika(String dzialPracownika) {
        this.dzialPracownika = dzialPracownika;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public String getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(String dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }
}
