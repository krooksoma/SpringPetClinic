package petdata.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import petdata.domain.PetType;
import petdata.domain.Visit;
import petdata.services.PetTypeService;

import java.util.Optional;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public Optional<Visit> findById(Long id) {
        return super.findById(id);
    }
}
