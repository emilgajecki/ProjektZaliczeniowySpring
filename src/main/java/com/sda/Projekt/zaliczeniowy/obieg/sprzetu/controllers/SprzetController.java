package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.SprzetDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.SprzetService;
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
public class SprzetController {

    @Autowired
    private SprzetService sprzetService;

    @RequestMapping(value = "/sprzetList", method = RequestMethod.GET)
    public String sprzetList(Model model) {

        model.addAttribute("sprzetList", sprzetService.getall());

        return "/sprzetList";
    }

    @RequestMapping(value = "/sprzet/add", method = RequestMethod.GET)
    public String dodajSprzet(Model model) {

        model.addAttribute("sprzet", new SprzetDto());

        return "/newDevice";
    }

    @RequestMapping(value = "/sprzet/add", method = RequestMethod.POST)
    public String dodajSprzet(@ModelAttribute("sprzet") @Validated SprzetDto sprzetDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "/newDevice";
        }
        sprzetDto.setCreateDate(new SimpleDateFormat(PracownicyMapper.DATE_FORMAT).format(new Date()));
        sprzetService.save(sprzetDto);

        return "redirect:/sprzetList";
    }

}
