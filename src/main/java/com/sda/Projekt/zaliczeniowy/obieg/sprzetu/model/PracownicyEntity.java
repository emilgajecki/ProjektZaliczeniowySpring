package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "pracownicy")
public class PracownicyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;

    @ManyToOne()
    @JoinColumn(name = "rolaID")
    private RolaPracownikaEntity pracIdRole;

    @ManyToOne()
    @JoinColumn(name = "deprtmentID")
    private  DzialyEntity pracIdDepartment;

    @OneToMany(mappedBy = "pracId")
    private List<WydanieEntity> wydanie;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date dataZablokowania;

    @Column(columnDefinition = "bit default 0")
    private boolean isActive;

    public Date getDataZablokowania() {
        return dataZablokowania;
    }

    public void setDataZablokowania(Date dataZwrotu) {
        this.dataZablokowania = dataZwrotu;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public PracownicyEntity(){
    }

    public PracownicyEntity(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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
    public RolaPracownikaEntity getPracIdRole() {
        return pracIdRole;
    }
    public void setPracIdRole(RolaPracownikaEntity pracIdRole) {
        this.pracIdRole = pracIdRole;
    }
    public DzialyEntity getPracIdDepartment() {
        return pracIdDepartment;
    }
    public void setPracIdDepartment(DzialyEntity pracIdDeptmewnt) {
        this.pracIdDepartment = pracIdDeptmewnt;
    }
    public List<WydanieEntity> getWydanie() {
        return wydanie;
    }

    public void setWydanie(List<WydanieEntity> wydanie) {
        this.wydanie = wydanie;
    }
}