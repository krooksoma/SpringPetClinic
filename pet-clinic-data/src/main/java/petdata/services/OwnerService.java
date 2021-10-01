package petdata.services;


import petdata.model.PetOwner;

public interface OwnerService extends CrudService<PetOwner, Long>{
    PetOwner findByLastName(String lastName);
}
