package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class PracownicyDto {

    private long id;
    private String name;
    private String lastName;
    private long pracIdRole;
    private long pracIdDepartment;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPracIdRole() {
        return pracIdRole;
    }

    public void setPracIdRole(long pracIdRole) {
        this.pracIdRole = pracIdRole;
    }

    public long getPracIdDepartment() {
        return pracIdDepartment;
    }

    public void setPracIdDepartment(long pracIdDepartment) {
        this.pracIdDepartment = pracIdDepartment;
    }


}
