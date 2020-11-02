package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.TypUrzadzeniaDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.TypUrzadzeniaListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.TypUrzadzeniaMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzeniaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.TypUrzadzeniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class TypUrzadzeniaService {

    @Autowired
    private TypUrzadzeniaRepository typUrzadzeniaRepository;

    public List<TypUrzadzeniaListItemDto> getall(){
        Iterable<TypUrzadzeniaEntity> typ = typUrzadzeniaRepository.findAll();
        List<TypUrzadzeniaListItemDto> dtos = TypUrzadzeniaMapper.mapEntityToListItemDto(typ);

        return dtos;
    }

    public void save(TypUrzadzeniaDto typUrzadzeniaDto) {

        try {
            TypUrzadzeniaEntity entity = TypUrzadzeniaMapper.mapDtoToEntity(typUrzadzeniaDto);
            typUrzadzeniaRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
