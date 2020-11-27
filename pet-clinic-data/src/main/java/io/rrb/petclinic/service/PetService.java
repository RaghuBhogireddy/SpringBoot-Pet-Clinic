package io.rrb.petclinic.service;

import io.rrb.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet Save(Pet pet);
    Set<Pet> findAll();
}
