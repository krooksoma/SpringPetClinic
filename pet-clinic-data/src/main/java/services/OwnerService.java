package services;


import model.PetOwner;

import java.util.Set;

public interface OwnerService extends CrudService<PetOwner, Long>{
    PetOwner findByLastName(String lastName);
}
