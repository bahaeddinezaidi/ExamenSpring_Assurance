package com.example.ExamenAssurances_baha_pringboot.services;

import com.example.ExamenAssurances_baha_pringboot.entities.Contrat;

public interface IServiceC {
    public Contrat ajouterContrat (Contrat c);
    public Contrat getContratBf (int idBf);
}
