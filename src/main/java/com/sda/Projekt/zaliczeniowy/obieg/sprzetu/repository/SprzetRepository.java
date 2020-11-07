package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.WydanieEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.Valid;
import java.util.List;

@Repository
public interface SprzetRepository extends JpaRepository<SprzetEntity, Long> {

    SprzetEntity getById(long id);



    @Query(value="  select * from  sprzet s where not exists (select 1 from wydanie w where w.sprzetid =s.id and w.is_active = 1)",nativeQuery = true)
    List<SprzetEntity> getActiveDevice();
}
