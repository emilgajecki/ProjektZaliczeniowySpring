package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.RolaPracownikaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolaPracownikaRepository extends JpaRepository<RolaPracownikaEntity,Long> {

    RolaPracownikaEntity getByIdRole(long id);
}
