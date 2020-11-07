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
            dto.setImiePracownika(entity.getPracId().getName());
            dto.setNazwaPracownika(entity.getPracId().getLastName());
            dto.setProducnetSprzetu(entity.getSprzetId().getProducent());
            dto.setModelSprzetu(entity.getSprzetId().getModel());
            dto.setSerialNumber(entity.getSprzetId().getSerialNumber());
            dto.setUwagi(entity.getUwagi());
            dto.setCreateDate(new SimpleDateFormat(DATE_FORMAT).format(entity.getCreateDate()));
            if(entity.getDataZwrotu()!=null){
                dto.setDataZwrotu(new SimpleDateFormat(DATE_FORMAT).format(entity.getDataZwrotu()));
            }


            result.add(dto);
        }

        return result;
    }

    public static WydanieEntity mapDtoToEntity(WydanieDto dto) throws ParseException {

        WydanieEntity entity = new WydanieEntity();
        entity.setId(dto.getId());
        entity.setUwagi(dto.getUwagi());
        entity.setCreateDate(new SimpleDateFormat(DATE_FORMAT).parse(dto.getCreateDate()));

        return entity;
    }
}
