package com.example.ExamenAssurances_baha_pringboot.services.IMPL;

import com.example.ExamenAssurances_baha_pringboot.entities.Contrat;
import com.example.ExamenAssurances_baha_pringboot.repositiries.IRepositaryC;
import com.example.ExamenAssurances_baha_pringboot.services.IServiceC;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceImpC implements IServiceC {
    final IRepositaryC ConRepositary;

    @Override
    public Contrat ajouterContrat(Contrat c) {
        return  ConRepositary.save(c);
    }

    @Override
    public Contrat getContratBf(int idBf) {
        return this.ConRepositary.getContratPlusAncien(idBf);
    }
}
