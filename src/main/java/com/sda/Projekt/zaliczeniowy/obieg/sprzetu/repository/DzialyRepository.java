package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.DzialyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DzialyRepository extends JpaRepository<DzialyEntity, Long> {

    DzialyEntity getById (long id);
}
