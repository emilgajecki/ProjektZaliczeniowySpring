package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class SprzetMapper {

    public static List<SprzetListItemDto> mapEntityToListItemDto(Iterable<SprzetEntity> sprzetEntities) {

        List<SprzetListItemDto> result = new ArrayList<>();

        for (SprzetEntity entity : sprzetEntities) {

            SprzetListItemDto dto = new SprzetListItemDto();
            dto.setId(entity.getId());
            dto.setProducent(entity.getProducent());
            dto.setModel(entity.getModel());
            dto.setSerialNumber(entity.getSerialNumber());
            dto.setTypUrzadzenia(entity.getSprzetIdTyp().getTypUrządzenia());

            result.add(dto);
        }

        return result;
    }

    public static SprzetEntity mapDtoToEntity(SprzetDto dto) throws ParseException {

        SprzetEntity entity = new SprzetEntity();
        entity.setId(dto.getId());
        entity.setProducent(dto.getProducent());
        entity.setModel(dto.getModel());
        entity.setSerialNumber(dto.getSerialNumber());


        return entity;
    }
}
