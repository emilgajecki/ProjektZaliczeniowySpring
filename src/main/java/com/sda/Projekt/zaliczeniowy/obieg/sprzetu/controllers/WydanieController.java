package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.Wydanie;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.WydanieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class WydanieController {

    @Autowired
    WydanieRepository repository;

    @GetMapping("/wydanie")
    public List<Wydanie> wyszstkieWydania(){
        return repository.findAll();
    }



    @PostMapping("/wydanie")
    public void wydanieSprzętu (@RequestBody Wydanie wydnaie){
        repository.save(wydnaie);
    }

    @DeleteMapping("wydanie")
    private String usunWydanie (long id){
        repository.deleteById(id);
        return "usunieto rekord "+id;
    }

    //@PostConstruct
    public void dodajKilkaWydan(){
        Wydanie wydanie1 = new Wydanie(1,2);
        Wydanie wydanie2 = new Wydanie (2,2);
        repository.save(wydanie1);
        repository.save(wydanie2);
    }


}
