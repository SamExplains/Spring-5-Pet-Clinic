package com.samuels5.spring5petclinic.services;

import com.samuels5.spring5petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
