package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "dzialy")
public class DzialyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nameDepartment;

    @OneToMany(mappedBy = "pracIdDepartment")
    private List<PracownicyEntity> pracownicy;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    public DzialyEntity(){
    }

    public DzialyEntity(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long idDepartment) {
        this.id = idDepartment;
    }

    public List<PracownicyEntity> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(List<PracownicyEntity> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
}
