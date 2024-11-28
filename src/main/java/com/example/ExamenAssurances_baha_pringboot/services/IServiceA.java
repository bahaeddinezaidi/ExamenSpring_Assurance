package com.example.ExamenAssurances_baha_pringboot.services;

import com.example.ExamenAssurances_baha_pringboot.entities.Assurance;

public interface IServiceA {
    public Assurance ajouterAssurance (Assurance a, int cinBf, String matricule);
    public float getMontantBf (int cinBf);
}
