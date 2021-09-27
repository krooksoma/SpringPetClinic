package services.map;

import model.PetOwner;
import services.CrudService;
import services.map.AbstractMapService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<PetOwner, Long> implements CrudService<PetOwner, Long> {
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
}
