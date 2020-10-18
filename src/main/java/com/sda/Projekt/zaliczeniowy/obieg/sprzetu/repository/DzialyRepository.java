package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.DzialyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DzialyRepository extends JpaRepository<DzialyEntity, Long> {

    DzialyEntity getIdDepartment (long id);
}
