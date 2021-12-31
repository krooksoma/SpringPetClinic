package petdata.services.map;

import petdata.domain.Visit;
import petdata.services.VisitService;

import java.util.Optional;
import java.util.Set;


public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {



    @Override
    public <S extends Visit> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
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
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Visit> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Visit> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getPetOwner() == null
                || visit.getPet().getId() == null){
            throw new RuntimeException("Invalid visit");
        }

        return super.save(visit);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit entity) {
        super.delete(entity);
    }
}
