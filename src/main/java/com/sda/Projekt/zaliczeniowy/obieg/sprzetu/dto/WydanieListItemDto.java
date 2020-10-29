package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class WydanieListItemDto {

    private long id;
    private String nazwaPracownika;
    private String createDate;

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
}
