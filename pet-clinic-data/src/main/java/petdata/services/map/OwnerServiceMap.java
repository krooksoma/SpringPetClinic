package petdata.services.map;

import org.springframework.context.annotation.Profile;
import petdata.model.Pet;
import petdata.model.PetOwner;
import org.springframework.stereotype.Service;

import petdata.services.OwnerService;
import petdata.services.PetService;
import petdata.services.PetTypeService;
import java.util.Set;


@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<PetOwner, Long> implements OwnerService{
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public PetOwner save(PetOwner object) {
        if(object != null){
            if(object.getPets() != null){
                object.getPets().forEach(pet ->{
                    if (pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }
    }

    @Override
    public Set<PetOwner> findAll(){
        return super.findAll();
    }

    @Override
    public PetOwner findById(Long id){
        return super.findById(id);
    }

    @Override
    public void delete(PetOwner object){
        super.delete(object);
    }

    @Override
    public void deleteById(Long id){
        super.deleteById(id);
    }

    @Override
    public PetOwner findByLastName(String lastName) {
        return null;
    }
}
