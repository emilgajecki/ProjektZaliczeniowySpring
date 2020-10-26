package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.RolaDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.RolaListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.RolaPracownikaEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class RolaMapper {

    public static String DATE_FORMAT = "dd-MM-yyyy";

    public static List<RolaListItemDto> mapEntityToListItemDto(Iterable<RolaPracownikaEntity> rolaPracownikaEntities) {

        List<RolaListItemDto> result = new ArrayList<>();

        for (RolaPracownikaEntity entity : rolaPracownikaEntities) {

            RolaListItemDto dto = new RolaListItemDto();
            dto.setId(entity.getIdRole());
            dto.setRole(entity.getRole());
            dto.setCreateDate(new SimpleDateFormat(DATE_FORMAT).format(entity.getCreateDate()));

            result.add(dto);
        }

        return result;
    }

    public static RolaPracownikaEntity mapDtoToEntity(RolaDto dto) throws ParseException {

        RolaPracownikaEntity entity = new RolaPracownikaEntity();
        entity.setIdRole(dto.getId());
        entity.setRole(dto.getRole());
        entity.setCreateDate(new SimpleDateFormat(DATE_FORMAT).parse(dto.getCreateDate()));

        return entity;
    }
}
