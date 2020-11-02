package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class TypUrzadzeniaListItemDto {

    private long id;
    private String typUrzadzenia;
    private String createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypUrzadzenia() {
        return typUrzadzenia;
    }

    public void setTypUrzadzenia(String typUrzadzenia) {
        this.typUrzadzenia = typUrzadzenia;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
