package com.example.ExamenAssurances_baha_pringboot.services.IMPL;

import  com.example.ExamenAssurances_baha_pringboot.entities.Assurance;
import com.example.ExamenAssurances_baha_pringboot.entities.Beneficiaire;
import com.example.ExamenAssurances_baha_pringboot.entities.Contrat;
import com.example.ExamenAssurances_baha_pringboot.repositiries.IRepositaryA;
import com.example.ExamenAssurances_baha_pringboot.repositiries.IRepositaryB;
import com.example.ExamenAssurances_baha_pringboot.repositiries.IRepositaryC;
import com.example.ExamenAssurances_baha_pringboot.services.IServiceA;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import java.util.Map;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ServiceImpA implements IServiceA {
    final IRepositaryA AssURepositary;
    final IRepositaryB BenRepositary;
    final IRepositaryC ConRepositary;





    @Transactional
    @Override
    public Assurance ajouterAssurance(Assurance a, int cinBf, String matricule) {
        a=AssURepositary.save(a);
        Contrat contrat=ConRepositary.findByMatricule(matricule);
        Beneficiaire beneficiaire=BenRepositary.findBycin(cinBf);
        a.setBeneficiaire(beneficiaire);
        a.setContrat(contrat);
        return a ;
    }

    @Override
    public float getMontantBf(int cinBf) {


        return AssURepositary.getMontantBf(cinBf);
    }


    @Scheduled(fixedRate = 60000) // Exécution toutes les 60 secondes
    public void statistiques() {
        Map<Beneficiaire, Long> statistiquesAssurances = AssURepositary.findAll()
                .stream()
                .collect(Collectors.groupingBy(Assurance::getBeneficiaire, Collectors.counting()));

        // Afficher les statistiques
        statistiquesAssurances.entrySet().stream()
                .sorted(Map.Entry.<Beneficiaire, Long>comparingByValue().reversed())
                .forEach(entry -> System.out.println("Bénéficiaire: " + entry.getKey().getCin() +
                        ", Nombre d'assurances: " + entry.getValue()));
    }}




