package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracowinicyListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracownicyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class PracownicyMapper {

    public static List<PracownicyDto> mapEntityToDto(Iterable<PracownicyEntity> pracownicyEntities) {

        List<PracownicyDto> result = new ArrayList<>();

        for (PracownicyEntity entity : pracownicyEntities) {

            PracownicyDto dto = new PracownicyDto();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setLastName(entity.getLastName());

            result.add(dto);
        }

        return result;
    }

    public static List<PracowinicyListItemDto> mapEntityToListItemDto(Iterable<PracownicyEntity> pracownicyEntities) {

        List<PracowinicyListItemDto> result = new ArrayList<>();

        for (PracownicyEntity entity : pracownicyEntities) {

            PracowinicyListItemDto dto = new PracowinicyListItemDto();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setLastName(entity.getLastName());
            dto.setRolaPracownika(entity.getPracIdRole().getRole());
            dto.setDzialPracownika(entity.getPracIdDepartment().getNameDepartment());

            result.add(dto);
        }

        return result;
    }



    public static PracownicyEntity mapDtoToEntity(PracownicyDto dto) throws ParseException {

        PracownicyEntity entity = new PracownicyEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setLastName(dto.getLastName());

        return entity;
    }
}
