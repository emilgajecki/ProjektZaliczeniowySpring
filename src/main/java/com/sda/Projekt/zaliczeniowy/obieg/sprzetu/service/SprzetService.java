package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.SprzetMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzeniaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.SprzetRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.TypUrzadzeniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class SprzetService {

    @Autowired
    private SprzetRepository sprzetRepository;

    @Autowired
    private TypUrzadzeniaRepository typUrzadzeniaRepository;


    public List<SprzetListItemDto> getall() {

        Iterable<SprzetEntity> sprzety = sprzetRepository.findAll();
        List<SprzetListItemDto> dtos = SprzetMapper.mapEntityToListItemDto(sprzety);

        return dtos;
    }

    public void save(SprzetDto sprzetDto) {

        try {
            SprzetEntity entity = SprzetMapper.mapDtoToEntity(sprzetDto);
            TypUrzadzeniaEntity typUrzadzeniaEntity = typUrzadzeniaRepository.getById(sprzetDto.getId());
            entity.setSprzetIdTyp(typUrzadzeniaEntity);
            sprzetRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
