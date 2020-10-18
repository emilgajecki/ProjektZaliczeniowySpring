package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzeniaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypUrzadzeniaRepository extends JpaRepository <TypUrzadzeniaEntity,Long> {

    TypUrzadzeniaEntity getById(long id);
}
