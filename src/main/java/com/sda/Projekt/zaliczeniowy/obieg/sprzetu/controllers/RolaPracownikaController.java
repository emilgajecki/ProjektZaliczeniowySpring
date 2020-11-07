package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.RolaDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.RolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RolaPracownikaController {


    @Autowired
    private RolaService rolaService ;

    @RequestMapping(value = "/rolaList", method = RequestMethod.GET)
    public String rolaList(Model model) {

        model.addAttribute("rolaList", rolaService.getall());

        return "/rolaList";
    }

    @RequestMapping(value = "/rola/add", method = RequestMethod.GET)
    public String dodajRola(Model model) {

        model.addAttribute("rola", new RolaDto());

        return "/newStanowisko";
    }

    @RequestMapping(value = "/rola/add", method = RequestMethod.POST)
    public String dodajRole(@ModelAttribute("rola") @Valid RolaDto rolaDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "/newStanowisko";
        }
        rolaDto.setCreateDate(new SimpleDateFormat(PracownicyMapper.DATE_FORMAT).format(new Date()));
        rolaService.save(rolaDto);

        return "redirect:/rolaList";
    }

}
