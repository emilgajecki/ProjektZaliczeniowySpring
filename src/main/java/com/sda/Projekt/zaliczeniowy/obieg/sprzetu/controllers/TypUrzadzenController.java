package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.RolaDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.dto.TypUrzadzeniaDto;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.mapper.TypUrzadzeniaMapper;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.service.TypUrzadzeniaService;
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
public class TypUrzadzenController {

    @Autowired
    private TypUrzadzeniaService typUrzadzeniaService ;

    @RequestMapping(value = "/typList", method = RequestMethod.GET)
    public String typList(Model model) {

        model.addAttribute("typList", typUrzadzeniaService.getall());

        return "/typList";
    }

    @RequestMapping(value = "/typ/add", method = RequestMethod.GET)
    public String dodajTyp(Model model) {

        model.addAttribute("typ", new TypUrzadzeniaDto());

        return "newTyp";
    }

    @RequestMapping(value = "/typ/add", method = RequestMethod.POST)
    public String dodajTyp(@ModelAttribute("typ") @Valid TypUrzadzeniaDto typUrzadzeniaDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "newTyp";
        }
        typUrzadzeniaDto.setCreateDate(new SimpleDateFormat(TypUrzadzeniaMapper.DATE_FORMAT).format(new Date()));
        typUrzadzeniaService.save(typUrzadzeniaDto);

        return "redirect:/typList";
    }
}
