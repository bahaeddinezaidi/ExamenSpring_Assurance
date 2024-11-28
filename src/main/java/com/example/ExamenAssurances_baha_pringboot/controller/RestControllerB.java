package com.example.ExamenAssurances_baha_pringboot.controller;

import com.example.ExamenAssurances_baha_pringboot.entities.Beneficiaire;
import com.example.ExamenAssurances_baha_pringboot.entities.TypeContrat;
import com.example.ExamenAssurances_baha_pringboot.services.IServiceB;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor

@Slf4j
@RestController
@RequestMapping("/Ben")
public class RestControllerB {
    private final IServiceB benServices;
    @PostMapping("/addB")
    public Beneficiaire addB(@RequestBody Beneficiaire bf){
        return benServices.ajouterBeneficiaire(bf);
    }

    @GetMapping("/get/{type}")
    public Set<Beneficiaire> getBeneficairesByType(@PathVariable("type") TypeContrat typeContrat) {
        return benServices.getBeneficairesByType(typeContrat);
    }


    }
