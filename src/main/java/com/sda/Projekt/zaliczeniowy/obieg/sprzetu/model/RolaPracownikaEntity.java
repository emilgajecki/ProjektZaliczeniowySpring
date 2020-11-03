package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "stanowisko")
public class RolaPracownikaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRole;
    private String role;

    @OneToMany(mappedBy = "pracIdRole")
    private List<PracownicyEntity> pracownicy;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    public List<PracownicyEntity> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(List<PracownicyEntity> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public RolaPracownikaEntity(){

    }

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public RolaPracownikaEntity(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
