package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

import javax.validation.constraints.NotNull;

public class DzialyDto {

    private long id;
    @NotNull
    private String nameDepartment;
    private String createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
