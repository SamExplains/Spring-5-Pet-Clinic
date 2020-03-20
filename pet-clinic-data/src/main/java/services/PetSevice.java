package services;

import com.samuels5.spring5petclinic.model.Pet;

import java.util.Set;

public interface PetSevice {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
