package com.example.ExamenAssurances_baha_pringboot.controller;

import com.example.ExamenAssurances_baha_pringboot.entities.Assurance;
import com.example.ExamenAssurances_baha_pringboot.services.IServiceA;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor

@Slf4j
@RestController
@RequestMapping("/assurances")
public class RestControllerA {


        private final IServiceA assuranceService;





    @PostMapping("/add/{cin}/{mat}")
    public Assurance ajouterAssurance(@RequestBody Assurance a, @PathVariable("cin") int cinBf, @PathVariable("mat") String matricule) {
        return assuranceService.ajouterAssurance(a,cinBf,matricule);

    }
    @GetMapping("/getM/{cinBf}")
    public Float getMontantBf( @PathVariable("cinBf") int cinBf) {

        return assuranceService.getMontantBf(cinBf);
    }
    }

