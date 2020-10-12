package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.Sprzet;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.SprzetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SprzetController {

    //do pola repozytorium wstrzyknie bean/obiekt istniejace repozytorium
    @Autowired
    SprzetRepository reposiotory;

    // pobieranie danych z bazy
    @GetMapping("/sprzet")
    public List<Sprzet> calySprzet(){
        return reposiotory.findAll();
    }

    //odpowiada za wprowadzenie danych - np wprowadzanie danych z formularza
    @PostMapping("/sprzet")
    //odpowiada za przekazywanie parametrow
    public String dodajSprzet(@RequestBody Sprzet sprzet){
        reposiotory.save(sprzet);
        return "Dodałem sprzet " + sprzet.getNazwaSprzetu();
    }

    //usuwanie danego wpisu w baze
    @DeleteMapping("/sprzet")
    public String usunSprzet(long id){
        reposiotory.deleteById(id);
        return "usunięto rekord "+id;
    }

    //sposób na wywołanie metody zaraz po kontrolerze.
    //@PostConstruct
    public void dodajKilkaSprzetow(){
        Sprzet sprzet1 = new Sprzet("DELL","Laptop");
        Sprzet sprzet2 = new Sprzet("HP","Monitor");
        reposiotory.save(sprzet1);
        reposiotory.save(sprzet2);
    }
}
