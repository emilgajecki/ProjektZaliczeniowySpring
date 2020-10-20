package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.DzialyDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.PracownicyMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.DzialyService;
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
public class DzialyController {

    @Autowired
    private DzialyService dzialyService;

    @RequestMapping(value = "/dzialList", method = RequestMethod.GET)
    public String dzialyList(Model model) {

        model.addAttribute("dzialList", dzialyService.getall());

        return "/dzialList";
    }

    @RequestMapping(value = "/dzialy/add", method = RequestMethod.GET)
    public String dodajDzial(Model model) {

        model.addAttribute("dzial", new DzialyDto());

        return "/newDzial";
    }

    @RequestMapping(value = "/dzialy/add", method = RequestMethod.POST)
    public String dodajDzial(@ModelAttribute("dzial") @Validated DzialyDto dzialyDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "/newDzial";
        }
        dzialyDto.setCreateDate(new SimpleDateFormat(PracownicyMapper.DATE_FORMAT).format(new Date()));
        dzialyService.save(dzialyDto);

        return "redirect:/dzialList";
    }
}
