package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.Pracownicy;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.PraconicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class PracownicyController {

    @Autowired
    PraconicyRepository reposiotory;

    @GetMapping("/pracownicy")
    public List<Pracownicy> wszyscyPraconicy(){
        return reposiotory.findAll();
    }

    @PostMapping("/pracownicy")
    public String dodajPracownika(@RequestBody Pracownicy pracownicy){
        reposiotory.save(pracownicy);
        return "Dodałem praconika " + pracownicy.getName()+ " "+pracownicy.getLastName();
    }

    @DeleteMapping("/pracownicy")
    public String usunPracownika(long id){
        reposiotory.deleteById(id);
        return "usunięto rekord "+id;
    }

    //@PostConstruct
    public void dodajKilkuPracownikow(){
        Pracownicy pracownik1 = new Pracownicy("Emil","Gajęcki",1);
        Pracownicy pracownik2 = new Pracownicy("Przemyslaw","Zacheja",2);
        Pracownicy pracownik3 = new Pracownicy("Tomasz","Prażniewski",2);
        reposiotory.save(pracownik1);
        reposiotory.save(pracownik2);
        reposiotory.save(pracownik3);
    }
}
