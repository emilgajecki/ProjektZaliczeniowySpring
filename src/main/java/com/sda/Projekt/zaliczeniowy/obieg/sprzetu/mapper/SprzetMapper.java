package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SprzetMapper {

    public static String DATE_FORMAT = "dd-MM-yyyy";

    public static List<SprzetListItemDto> mapEntityToListItemDto(Iterable<SprzetEntity> sprzetEntities) {

        List<SprzetListItemDto> result = new ArrayList<>();

        for (SprzetEntity entity : sprzetEntities) {

            SprzetListItemDto dto = new SprzetListItemDto();
            dto.setId(entity.getId());
            dto.setProducent(entity.getProducent());
            dto.setModel(entity.getModel());
            dto.setSerialNumber(entity.getSerialNumber());
            dto.setUwagi(entity.getUwagi());
            dto.setTypUrzadzenia(entity.getSprzetIdTyp().getTypUrządzenia());
            dto.setCreateDate(new SimpleDateFormat(DATE_FORMAT).format(entity.getCreateDate()));

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
        entity.setUwagi(dto.getUwagi());
        entity.setCreateDate(new SimpleDateFormat(DATE_FORMAT).parse(dto.getCreateDate()));

        return entity;
    }
}
