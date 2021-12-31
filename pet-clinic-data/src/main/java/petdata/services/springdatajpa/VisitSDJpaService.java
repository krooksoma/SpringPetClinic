package petdata.services.springdatajpa;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import petdata.domain.Visit;
import petdata.repositories.VisitRepository;
import petdata.services.VisitService;

import java.util.Optional;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService{

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public <S extends Visit> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Visit> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Visit> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Visit> findAll() {
        return null;
    }

    @Override
    public Iterable<Visit> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Visit entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Visit> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
