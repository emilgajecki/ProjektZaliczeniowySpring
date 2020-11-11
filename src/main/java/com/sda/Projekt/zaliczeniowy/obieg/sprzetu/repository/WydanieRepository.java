package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzeniaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.WydanieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WydanieRepository extends JpaRepository<WydanieEntity, Long> {

    WydanieEntity getById(long id);


}
