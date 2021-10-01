package services.map;

import model.Veterinarian;
import services.CrudService;
import services.VeterinarianService;

import java.util.Set;

public class VeterinarianServiceMap extends AbstractMapService<Veterinarian, Long> implements VeterinarianService {
    @Override
    public Set<Veterinarian> findAll() {
        return super.findAll();
    }

    @Override
    public Veterinarian findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Veterinarian save(Veterinarian object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Veterinarian object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}