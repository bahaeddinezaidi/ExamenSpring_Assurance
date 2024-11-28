package com.example.ExamenAssurances_baha_pringboot.controller;

import com.example.ExamenAssurances_baha_pringboot.entities.Contrat;
import com.example.ExamenAssurances_baha_pringboot.services.IServiceC;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor

@Slf4j
@RestController
@RequestMapping("/Contrat")
public class RestControllerC {
    private final IServiceC ConServices;
    @PostMapping("/addC")
    public Contrat addC(@RequestBody Contrat Cn){
        return ConServices.ajouterContrat(Cn);
    }


    @GetMapping("/get/{idBf}")
    public Contrat getContratBf(@PathVariable ("idBf") int idBf) {
        return this.ConServices.getContratBf(idBf);
    }


    }
