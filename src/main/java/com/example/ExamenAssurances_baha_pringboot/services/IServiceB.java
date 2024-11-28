package com.example.ExamenAssurances_baha_pringboot.services;

import com.example.ExamenAssurances_baha_pringboot.entities.Beneficiaire;
import com.example.ExamenAssurances_baha_pringboot.entities.TypeContrat;

import java.util.Set;

public interface IServiceB {
    public Beneficiaire ajouterBeneficiaire (Beneficiaire bf);
    public Set<Beneficiaire> getBeneficairesByType (TypeContrat typeContrat);

}
