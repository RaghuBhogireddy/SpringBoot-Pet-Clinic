package io.rrb.petclinic.service;

import io.rrb.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
