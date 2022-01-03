package petdata.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import petdata.domain.Specialty;
import petdata.domain.Visit;
import petdata.repositories.SpecialtyRepository;
import petdata.services.SpecialtyService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private SpecialtyRepository specialtyRepository;

    @Autowired
    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }
    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialtySet = new HashSet<>();
        specialtyRepository.findAll().forEach(specialtySet::add);
        return specialtySet;
    }

    @Override
    public Optional<Specialty> findById(Long aLong) {
        return specialtyRepository.findById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
