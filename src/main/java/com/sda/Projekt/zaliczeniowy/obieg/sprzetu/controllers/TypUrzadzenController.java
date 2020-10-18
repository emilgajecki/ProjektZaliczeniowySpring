package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzenia;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.TypUrzadzeniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class TypUrzadzenController {

    @Autowired
    TypUrzadzeniaRepository repository;

    @GetMapping("/typurzadzen")
    public List<TypUrzadzenia> wszystkieTypy(){
        return repository.findAll();
    }

    @PostMapping("/typurzadzen")
    public String dodajTypUrzadzenia(@RequestBody TypUrzadzenia typUrzadzenia){
        repository.save(typUrzadzenia);
        return "Dodałem typ utządzenia "+typUrzadzenia.getTypUrządzenia();
    }

    @DeleteMapping("/typurzadzen")
    public String usunTypUrzadzenia(long id){
        repository.deleteById(id);
        return "usunięto rekord "+id;
    }

    @PostConstruct
    public void dodajKilkaTypowSprzetu(){
        TypUrzadzenia urzadzenie1 = new TypUrzadzenia("laptop");
        TypUrzadzenia urzadzenie2 = new TypUrzadzenia("stacjonarka");
        TypUrzadzenia urzadzenie3 = new TypUrzadzenia("drukarka");
        repository.save(urzadzenie1);
        repository.save(urzadzenie2);
        repository.save(urzadzenie3);
    }
}
