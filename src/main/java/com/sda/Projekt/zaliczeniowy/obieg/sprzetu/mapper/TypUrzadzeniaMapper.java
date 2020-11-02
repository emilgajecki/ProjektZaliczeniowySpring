package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.TypUrzadzeniaDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.TypUrzadzeniaListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzeniaEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TypUrzadzeniaMapper {

    public static String DATE_FORMAT = "dd-MM-yyyy";

    public static List<TypUrzadzeniaListItemDto> mapEntityToListItemDto(Iterable<TypUrzadzeniaEntity> typUrzadzeniaEntities) {

        List<TypUrzadzeniaListItemDto> result = new ArrayList<>();

        for (TypUrzadzeniaEntity entity : typUrzadzeniaEntities) {

            TypUrzadzeniaListItemDto dto = new TypUrzadzeniaListItemDto();
            dto.setId(entity.getId());
            dto.setTypUrzadzenia(entity.getTypUrządzenia());
            dto.setCreateDate(new SimpleDateFormat(DATE_FORMAT).format(entity.getCreateDate()));

            result.add(dto);
        }

        return result;
    }

    public static TypUrzadzeniaEntity mapDtoToEntity(TypUrzadzeniaDto dto) throws ParseException {

        TypUrzadzeniaEntity entity = new TypUrzadzeniaEntity();
        entity.setId(dto.getId());
        entity.setTypUrządzenia(dto.getTypUrzadzenia());
        entity.setCreateDate(new SimpleDateFormat(DATE_FORMAT).parse(dto.getCreateDate()));

        return entity;
    }
}
