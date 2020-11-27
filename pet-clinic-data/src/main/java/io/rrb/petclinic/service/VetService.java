package io.rrb.petclinic.service;

import io.rrb.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet Save(Vet vet);
    Set<Vet> findAll();
}
