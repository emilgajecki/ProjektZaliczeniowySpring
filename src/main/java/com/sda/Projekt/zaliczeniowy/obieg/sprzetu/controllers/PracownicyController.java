package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.PracownicyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.PracownicyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.PracownicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PracownicyController {

    @Autowired
    PracownicyService pracownicyService;

    @RequestMapping(value = "/pracownicyList", method = RequestMethod.GET)
    public String pracownicyList(Model model) {

        model.addAttribute("pracownicyList", pracownicyService.getll());

        return "/pracownicyList";
    }

    @RequestMapping(value = "/pracownicy/add", method = RequestMethod.GET)
    public String dodajPracownika(Model model) {

        model.addAttribute("pracownicy", new PracownicyDto());

        return "/newUser";
    }

    @RequestMapping(value = "/pracownicy/add", method = RequestMethod.POST)
    public String dodajPracownika(@ModelAttribute("pracownicy") @Validated PracownicyDto pracownicyDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "/newUser";
        }
        pracownicyService.save(pracownicyDto);


            return "redirect:/pracownicyList";
    }
}
