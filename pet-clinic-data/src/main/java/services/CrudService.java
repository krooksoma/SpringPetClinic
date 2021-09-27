package services;

import java.util.Set;

//Mimics spring data repositories

public interface CrudService<Type, ID> {

    Set<Type> findAll();

    Type findById(ID id);

    Type save(Type object);

    void delete(Type object);

    void deleteById(ID id);
}
