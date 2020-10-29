package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.WydanieDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.WydanieListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.WydanieEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class WydanieMapper {

    public static String DATE_FORMAT = "dd-MM-yyyy";

    public static List<WydanieListItemDto> mapEntityToListItemDto(Iterable<WydanieEntity> wydanieEntities) {

        List<WydanieListItemDto> result = new ArrayList<>();

        for (WydanieEntity entity : wydanieEntities) {

            WydanieListItemDto dto = new WydanieListItemDto();
            dto.setId(entity.getId());
            dto.setNazwaPracownika(entity.getPracId().getLastName());
            dto.setCreateDate(new SimpleDateFormat(DATE_FORMAT).format(entity.getCreateDate()));

            result.add(dto);
        }

        return result;
    }

    public static WydanieEntity mapDtoToEntity(WydanieDto dto) throws ParseException {

        WydanieEntity entity = new WydanieEntity();
        entity.setId(dto.getId());
        entity.setCreateDate(new SimpleDateFormat(DATE_FORMAT).parse(dto.getCreateDate()));

        return entity;
    }
}
