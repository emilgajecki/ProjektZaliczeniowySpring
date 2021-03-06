package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracownicyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.SprzetEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.WydanieEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.PracownicyRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.SprzetRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.WydanieRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.DzialyService;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.PracownicyService;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.RolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PracownicyController {

    @Autowired
    private PracownicyService pracownicyService;

    @Autowired
    private DzialyService dzialyService;

    @Autowired
    private RolaService rolaService;

    @Autowired
    private PracownicyRepository pracownicyRepository;

    @Autowired
    private WydanieRepository wydanieRepository;


    @RequestMapping(value = "/pracownicyList", method = RequestMethod.GET)
    public String pracownicyList(Model model) {

        model.addAttribute("pracownicyList", pracownicyService.getAllUsers());

        return "/pracownicyList";
    }

    @RequestMapping(value = "/pracownicy/add", method = RequestMethod.GET)
    public String dodajPracownika(Model model) {

        model.addAttribute("dzialList", dzialyService.getall());
        model.addAttribute("rolaList", rolaService.getall());
        model.addAttribute("pracownicy", new PracownicyDto());


        return "newUser";
    }

    @RequestMapping(value = "/pracownicy/add", method = RequestMethod.POST)
    public String dodajPracownika(@ModelAttribute("pracownicy") @Valid PracownicyDto pracownicyDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "newUser";
        }
        pracownicyDto.setCreateDate(new SimpleDateFormat(PracownicyMapper.DATE_FORMAT).format(new Date()));
        pracownicyService.save(pracownicyDto);


            return "redirect:/pracownicyList";
    }

    @RequestMapping(value = "/pracownicy/del/{id}", method = RequestMethod.POST)
    public String zablokujPracownika(@PathVariable("id") Long id) {

        PracownicyEntity entity =  pracownicyRepository.getById(id);
        entity.setDataZablokowania(new Date());
        entity.setActive(false);
        pracownicyRepository.save(entity);


        return "redirect:/pracownicyList";
    }

    // dodać metode obslugujaca sprzet tylko danego pracownika

    @RequestMapping(value = "/wydanieListSprzet/{id}", method = RequestMethod.POST)
    public String pokazSprzetPracownika(long id) {

         WydanieEntity entity = (WydanieEntity) wydanieRepository.getPracownikDevice(id);

        return "redirect:/wydanieListSprzet";
    }

}
