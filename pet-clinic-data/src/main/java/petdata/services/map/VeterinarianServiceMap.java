package petdata.services.map;

import org.springframework.context.annotation.Profile;
import petdata.domain.Specialty;
import petdata.domain.Veterinarian;
import org.springframework.stereotype.Service;

import petdata.services.SpecialtyService;
import petdata.services.VeterinarianService;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VeterinarianServiceMap extends AbstractMapService<Veterinarian, Long> implements VeterinarianService {
    private final SpecialtyService specialtyService;

    public VeterinarianServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty ->{
                if(specialty.getId() == null){
                 Specialty savedSpecialty = specialtyService.save(specialty);
                 specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
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
