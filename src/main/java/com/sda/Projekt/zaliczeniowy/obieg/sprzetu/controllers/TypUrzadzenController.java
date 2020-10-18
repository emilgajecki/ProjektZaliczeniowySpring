package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.TypUrzadzeniaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.TypUrzadzeniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TypUrzadzenController {

    @Autowired
    TypUrzadzeniaRepository repository;

    @GetMapping("/typurzadzen")
    public List<TypUrzadzeniaEntity> wszystkieTypy(){
        return repository.findAll();
    }

    @PostMapping("/typurzadzen")
    public String dodajTypUrzadzenia(@RequestBody TypUrzadzeniaEntity typUrzadzenia){
        repository.save(typUrzadzenia);
        return "Dodałem typ utządzenia "+typUrzadzenia.getTypUrządzenia();
    }

    @DeleteMapping("/typurzadzen")
    public String usunTypUrzadzenia(long id){
        repository.deleteById(id);
        return "usunięto rekord "+id;
    }

    //@PostConstruct
    public void dodajKilkaTypowSprzetu(){
        TypUrzadzeniaEntity urzadzenie1 = new TypUrzadzeniaEntity("laptop");
        TypUrzadzeniaEntity urzadzenie2 = new TypUrzadzeniaEntity("stacjonarka");
        TypUrzadzeniaEntity urzadzenie3 = new TypUrzadzeniaEntity("drukarka");
        repository.save(urzadzenie1);
        repository.save(urzadzenie2);
        repository.save(urzadzenie3);
    }
}
