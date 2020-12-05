package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzeniaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.WydanieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WydanieRepository extends JpaRepository<WydanieEntity, Long> {

    WydanieEntity getById(long id);

    @Query(value=" select sprzet.producent, sprzet.model, sprzet.serial_number \n" +
            "from wydanie \n" +
            "inner join pracownicy on wydanie.pracid=pracownicy.id \n" +
            "inner join sprzet on wydanie.sprzetid=sprzet.id \n" +
            "where pracownicy.id= user",nativeQuery = true)
    List<WydanieEntity> getPracownikDevice(@Param("user") Long id);


}
