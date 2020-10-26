package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.RolaDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.RolaListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.RolaMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.RolaPracownikaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.RolaPracownikaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class RolaService {

    @Autowired
    private RolaPracownikaRepository rolaRepository;

    public List<RolaListItemDto> getall() {

        Iterable<RolaPracownikaEntity> rola = rolaRepository.findAll();
        List<RolaListItemDto> dtos = RolaMapper.mapEntityToListItemDto(rola);

        return dtos;
    }

    public void save(RolaDto rolaDto) {

        try {
            RolaPracownikaEntity entity = RolaMapper.mapDtoToEntity(rolaDto);
            rolaRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
