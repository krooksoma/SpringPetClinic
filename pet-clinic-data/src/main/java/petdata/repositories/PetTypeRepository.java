package petdata.repositories;

import org.springframework.data.repository.CrudRepository;
import petdata.domain.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
