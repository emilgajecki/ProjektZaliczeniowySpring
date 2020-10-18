package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto;

public class PracowinicyListItemDto {

    private long id;
    private String name;
    private String lastName;
    private String rolaPracownika;
    private String dzialPracownika;
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

    public String getRolaPracownika() {
        return rolaPracownika;
    }

    public void setRolaPracownika(String rolaPracownika) {
        this.rolaPracownika = rolaPracownika;
    }

    public String getDzialPracownika() {
        return dzialPracownika;
    }

    public void setDzialPracownika(String dzialPracownika) {
        this.dzialPracownika = dzialPracownika;
    }
}
