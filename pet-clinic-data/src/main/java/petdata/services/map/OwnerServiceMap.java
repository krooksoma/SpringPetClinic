package petdata.services.map;

import petdata.model.PetOwner;
import org.springframework.stereotype.Service;

import petdata.services.OwnerService;


import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<PetOwner, Long> implements OwnerService{
    @Override
    public PetOwner save(PetOwner object) {
        return super.save(object.getId(), object);
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
