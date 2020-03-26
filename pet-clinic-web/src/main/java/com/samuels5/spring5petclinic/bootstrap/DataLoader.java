package com.samuels5.spring5petclinic.bootstrap;

import com.samuels5.spring5petclinic.model.Owner;
import com.samuels5.spring5petclinic.model.Vet;
import com.samuels5.spring5petclinic.services.OwnerService;
import com.samuels5.spring5petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jane");
        owner2.setLastName("Doe");

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Lisa");
        vet1.setLastName("Asil");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Jackie");
        vet2.setLastName("Jamieson");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");


    }
}
