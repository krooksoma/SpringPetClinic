package services;


import model.PetOwner;

import java.util.Set;

public interface OwnerService {
    PetOwner findByLastName(String lastName);

    PetOwner findByID(Long id);

    PetOwner save(PetOwner petOwner);

    Set<PetOwner> findAll();




}
