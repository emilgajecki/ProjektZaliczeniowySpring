package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.DzialyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.DzialyListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.DzialyEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DzialyMapper {

    public static String DATE_FORMAT = "dd-MM-yyyy";

    public static List<DzialyListItemDto> mapEntityToListItemDto(Iterable<DzialyEntity> dzialyEntities) {

        List<DzialyListItemDto> result = new ArrayList<>();

        for (DzialyEntity entity : dzialyEntities) {

            DzialyListItemDto dto = new DzialyListItemDto();
            dto.setId(entity.getId());
            dto.setNameDepartment(entity.getNameDepartment());
            dto.setCreateDate(new SimpleDateFormat(DATE_FORMAT).format(entity.getCreateDate()));

            result.add(dto);
        }

        return result;
    }

    public static DzialyEntity mapDtoToEntity(DzialyDto dto) throws ParseException {

        DzialyEntity entity = new DzialyEntity();
        entity.setId(dto.getId());
        entity.setNameDepartment(dto.getNameDepartment());
        entity.setCreateDate(new SimpleDateFormat(DATE_FORMAT).parse(dto.getCreateDate()));

        return entity;
    }
}
