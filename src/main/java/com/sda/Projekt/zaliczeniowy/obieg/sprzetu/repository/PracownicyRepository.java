package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PracownicyRepository extends JpaRepository<PracownicyEntity, Long> {

    PracownicyEntity getById(long id);

    @Query(value="  select * from  pracownicy p where is_active = 1",nativeQuery = true)
    List<PracownicyEntity> getActiveUser();
}
