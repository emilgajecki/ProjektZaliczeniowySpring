package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;


import javax.validation.constraints.NotNull;

public class RolaDto {

    private long id;
    @NotNull
    private String role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
