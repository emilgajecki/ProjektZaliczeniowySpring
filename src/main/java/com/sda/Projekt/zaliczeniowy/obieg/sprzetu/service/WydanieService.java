package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.WydanieDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.WydanieListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.WydanieMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.WydanieEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.PracownicyRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.SprzetRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.WydanieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class WydanieService {

    @Autowired
    private WydanieRepository wydanieRepository;

    @Autowired
    private PracownicyRepository pracownicyRepository;

    @Autowired
    private SprzetRepository sprzetRepository;

    public List<WydanieListItemDto> getall() {

        Iterable<WydanieEntity> wydanie = wydanieRepository.findAll();
        List<WydanieListItemDto> dtos = WydanieMapper.mapEntityToListItemDto(wydanie);

        return dtos;
    }

    public void save(WydanieDto wydanieDto) {

        try {
            WydanieEntity entity = WydanieMapper.mapDtoToEntity(wydanieDto);
            PracownicyEntity pracownicyEntity = pracownicyRepository.getById(wydanieDto.getPracId());
            SprzetEntity sprzetEntity =sprzetRepository.getById(wydanieDto.getSprzetId());
            entity.setPracId(pracownicyEntity);
            entity.setSprzetId(sprzetEntity);
            wydanieRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
