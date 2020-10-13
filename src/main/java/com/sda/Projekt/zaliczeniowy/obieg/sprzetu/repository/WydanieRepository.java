package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.Wydanie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WydanieRepository extends JpaRepository<Wydanie,Long> {
}
