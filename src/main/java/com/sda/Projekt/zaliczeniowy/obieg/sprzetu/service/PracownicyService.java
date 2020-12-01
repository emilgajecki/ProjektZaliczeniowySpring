package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracowinicyListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracownicyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetListItemDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.SprzetMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.DzialyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.RolaPracownikaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.DzialyRepository;
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

    @Autowired
    private DzialyRepository dzialyRepository;


    public List<PracowinicyListItemDto> getall() {

        Iterable<PracownicyEntity> pracownicy = pracownicyRepository.getActiveUser();
        List<PracowinicyListItemDto> dtos = PracownicyMapper.mapEntityToListItemDto(pracownicy);

        return dtos;
    }

    public List<PracowinicyListItemDto> getAllUsers() {

        Iterable<PracownicyEntity> pracownicy = pracownicyRepository.findAll();
        List<PracowinicyListItemDto> dtos = PracownicyMapper.mapEntityToListItemDto(pracownicy);

        return dtos;
    }

    public void save(PracownicyDto pracownicyDto) {

        try {
            PracownicyEntity entity = PracownicyMapper.mapDtoToEntity(pracownicyDto);
            RolaPracownikaEntity rolaPracownika = rolaPracownikaRepository.getByIdRole(pracownicyDto.getPracIdRole());
            DzialyEntity dzialyEntity = dzialyRepository.getById(pracownicyDto.getPracIdDepartment());
            entity.setPracIdRole(rolaPracownika);
            entity.setPracIdDepartment(dzialyEntity);
            entity.setActive(true);
            pracownicyRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
