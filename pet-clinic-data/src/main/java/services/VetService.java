package services;

import com.samuels5.spring5petclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();

}
