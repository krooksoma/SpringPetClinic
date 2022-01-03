package petdata.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import petdata.domain.Veterinarian;
import petdata.domain.Visit;
import petdata.repositories.VetRepository;
import petdata.services.VeterinarianService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VeterinarianService {

    private VetRepository vetRepository;

    @Autowired
    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Veterinarian> findAll() {

        Set<Veterinarian> veterinarians = new HashSet<>();
        vetRepository.findAll().forEach(veterinarians::add);
        return veterinarians;
    }

    @Override
    public Optional<Veterinarian> findById(Long aLong) {
//        Optional<Veterinarian> vetOptional = vetRepository.findById(aLong);
//        return vetOptional.orElse(null);
        return vetRepository.findById(aLong);
    }

    @Override
    public Veterinarian save(Veterinarian object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Veterinarian object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
