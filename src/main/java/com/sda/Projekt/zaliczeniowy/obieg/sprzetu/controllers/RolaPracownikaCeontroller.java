package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.RolaPracownikaEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.RolaPracownikaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolaPracownikaCeontroller {


    @Autowired
    RolaPracownikaRepository repository;

    @GetMapping("/rola")
    public List<RolaPracownikaEntity> wszystkieRole(){
        return repository.findAll();
    }

    @PostMapping("/rola")
    public String rolaPracownika (@RequestBody RolaPracownikaEntity rolaPracownika){
        repository.save(rolaPracownika);
        return "Dodano role pracownika " +rolaPracownika.getRole();
    }

    @DeleteMapping("/rola")
    private String usunRolePracownika(long id){
        repository.deleteById(id);
        return "usunieto rekord "+id;
    }
    //@PostConstruct
    public void dodajRolePracownika(){
        RolaPracownikaEntity rola1 = new RolaPracownikaEntity("ADMIN");
        RolaPracownikaEntity rola2 = new RolaPracownikaEntity("USER");
        repository.save(rola1);
        repository.save(rola2);
    }
}
