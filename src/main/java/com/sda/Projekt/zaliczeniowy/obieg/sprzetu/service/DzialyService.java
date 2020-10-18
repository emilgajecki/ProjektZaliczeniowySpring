package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.DzialyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.DzialyListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.DzialyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.DzialyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.DzialyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class DzialyService {

    @Autowired
    private DzialyRepository dzialyRepository;

    public List<DzialyListItemDto> getall() {

        Iterable<DzialyEntity> dzialy = dzialyRepository.findAll();
        List<DzialyListItemDto> dtos = DzialyMapper.mapEntityToListItemDto(dzialy);

        return dtos;
    }

    public void save(DzialyDto dzialyDto) {

        try {
            DzialyEntity entity = DzialyMapper.mapDtoToEntity(dzialyDto);
            dzialyRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
