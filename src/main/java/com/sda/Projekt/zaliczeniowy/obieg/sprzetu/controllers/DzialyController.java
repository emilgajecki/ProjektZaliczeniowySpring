package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.controllers;

import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model.DzialyEntity;
import com.sda.Projekt.zaliczeniowy.obieg.sprzetu.repository.DzialyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class DzialyController {

    @Autowired
    DzialyRepository repository;

    @GetMapping("/dzial")
    public List<DzialyEntity> wszystkieDialy(){
        return repository.findAll();
    }

    @PostMapping("/dzial")
    public String dzialPracownika (@RequestBody DzialyEntity dzialyEntity){
        repository.save(dzialyEntity);
        return "Dodano dzial pracownika " +dzialyEntity.getNameDepartment();
    }

    @DeleteMapping("/dzial")
    private String usunDzial(long id){
        repository.deleteById(id);
        return "usunieto rekord "+id;
    }

    //@PostConstruct
    public void dodajDzialPracownika(){
        DzialyEntity dzial1 = new DzialyEntity("IT");
        DzialyEntity dzial2 = new DzialyEntity("RESZTA");
        repository.save(dzial1);
        repository.save(dzial2);
    }
}
