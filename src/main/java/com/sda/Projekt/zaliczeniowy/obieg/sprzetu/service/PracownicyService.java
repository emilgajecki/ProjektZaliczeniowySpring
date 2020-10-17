package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracownicyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.PracownicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class PracownicyService {

    @Autowired
    private PracownicyRepository pracownicyRepository;

    public List<PracownicyDto> getll() {

        Iterable<PracownicyEntity> pracownicy = pracownicyRepository.findAll();
        List<PracownicyDto> dtos = PracownicyMapper.mapEntityToDto(pracownicy);

        return dtos;
    }

    public void save(PracownicyDto pracownicyDto) {

        try {
            PracownicyEntity entity = PracownicyMapper.mapDtoToEntity(pracownicyDto);
            pracownicyRepository.save(entity);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
