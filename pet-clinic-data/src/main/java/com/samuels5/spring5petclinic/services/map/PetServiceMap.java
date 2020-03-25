package com.samuels5.spring5petclinic.services.map;

import com.samuels5.spring5petclinic.model.Pet;
import com.samuels5.spring5petclinic.services.PetSevice;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetSevice {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }



}
