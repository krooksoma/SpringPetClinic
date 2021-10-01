package petdata.services.map;

import petdata.model.Veterinarian;
import org.springframework.stereotype.Service;

import petdata.services.VeterinarianService;

import java.util.Set;
@Service
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
