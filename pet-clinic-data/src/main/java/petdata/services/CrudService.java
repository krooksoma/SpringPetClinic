package petdata.services;

import petdata.domain.Visit;

import java.util.Optional;
import java.util.Set;

//Mimics spring data repositories

public interface CrudService<Type, ID> {

    Set<Type> findAll();

    Optional<Type> findById(ID id);

    Type save(Type object);

    void delete(Type object);

    void deleteById(ID id);
}
