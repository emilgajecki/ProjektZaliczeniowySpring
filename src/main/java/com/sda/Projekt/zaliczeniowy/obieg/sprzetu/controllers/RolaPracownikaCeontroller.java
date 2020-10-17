package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.RolaPracownika;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.PracownicyRepository;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.RolaPracownikaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class RolaPracownikaCeontroller {


    @Autowired
    RolaPracownikaRepository repository;

    @GetMapping("/rola")
    public List<RolaPracownika> wszystkieRole(){
        return repository.findAll();
    }

    @PostMapping("/rola")
    public String rolaPracownika (@RequestBody RolaPracownika rolaPracownika){
        repository.save(rolaPracownika);
        return "Dodano role praocenika " +rolaPracownika.getRole();
    }

    @DeleteMapping("/rola")
    private String usunRolePracownika(long id){
        repository.deleteById(id);
        return "usunieto rekord "+id;
    }

    //@PostConstruct
    public void dodajRolePracownika(){
        RolaPracownika rola1 = new RolaPracownika("ADMIN");
        RolaPracownika rola2 = new RolaPracownika("USER");
        repository.save(rola1);
        repository.save(rola2);
    }
}
