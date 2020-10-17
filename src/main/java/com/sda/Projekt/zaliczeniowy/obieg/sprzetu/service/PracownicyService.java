package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracowinicyListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracownicyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.RolaPracownika;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.PracownicyRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.RolaPracownikaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class PracownicyService {

    @Autowired
    private PracownicyRepository pracownicyRepository;

    @Autowired
    private RolaPracownikaRepository rolaPracownikaRepository;

    public List<PracowinicyListItemDto> getll() {

        Iterable<PracownicyEntity> pracownicy = pracownicyRepository.findAll();
        List<PracowinicyListItemDto> dtos = PracownicyMapper.mapEntityToListItemDto(pracownicy);

        return dtos;
    }

    public void save(PracownicyDto pracownicyDto) {

        try {
            PracownicyEntity entity = PracownicyMapper.mapDtoToEntity(pracownicyDto);
            RolaPracownika rolaPracownika = rolaPracownikaRepository.getByIdRole(pracownicyDto.getPracIdRole());
            entity.setPracIdRole(rolaPracownika);
            pracownicyRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
