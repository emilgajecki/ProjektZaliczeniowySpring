package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracownicyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.DzialyService;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.PracownicyService;
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
public class PracownicyController {

    @Autowired
    private PracownicyService pracownicyService;

    @Autowired
    private DzialyService dzialyService;



    @RequestMapping(value = "/pracownicyList", method = RequestMethod.GET)
    public String pracownicyList(Model model) {

        model.addAttribute("pracownicyList", pracownicyService.getall());

        return "/pracownicyList";
    }

    @RequestMapping(value = "/pracownicy/add", method = RequestMethod.GET)
    public String dodajPracownika(Model model) {

        model.addAttribute("dzialList", dzialyService.getall().toString().trim());
        model.addAttribute("pracownicy", new PracownicyDto());


        return "/newUser";
    }

    @RequestMapping(value = "/pracownicy/add", method = RequestMethod.POST)
    public String dodajPracownika(@ModelAttribute("pracownicy") @Validated PracownicyDto pracownicyDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "/newUser";
        }
        pracownicyDto.setCreateDate(new SimpleDateFormat(PracownicyMapper.DATE_FORMAT).format(new Date()));
        pracownicyService.save(pracownicyDto);


            return "redirect:/pracownicyList";
    }
}
