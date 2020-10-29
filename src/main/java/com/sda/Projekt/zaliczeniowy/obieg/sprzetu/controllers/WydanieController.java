package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.WydanieDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.PracownicyService;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.WydanieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WydanieController {

    @Autowired
    private WydanieService wydanieService;

    @Autowired
    private PracownicyService pracownicyService;

    @RequestMapping(value = "/wydanieList", method = RequestMethod.GET)
    public String wydanieList(Model model) {

        model.addAttribute("wydanieList", wydanieService.getall());

        return "/wydanieList";
    }

    @RequestMapping(value = "/wydanie/add", method = RequestMethod.GET)
    public String wydajSprzet(Model model) {

        model.addAttribute("pracownicyList", pracownicyService.getall());
        model.addAttribute("wydanie", new WydanieDto());


        return "newWydanie";
    }

    @RequestMapping(value = "/wydanie/add", method = RequestMethod.POST)
    public String dodajWydanie(@ModelAttribute("wydanie") @Validated WydanieDto wydanieDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "newWydanie";
        }
        wydanieDto.setCreateDate(new SimpleDateFormat(PracownicyMapper.DATE_FORMAT).format(new Date()));
        wydanieService.save(wydanieDto);

        return "redirect:/wydanieList";
    }
}
