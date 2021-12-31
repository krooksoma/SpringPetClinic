package petdata.repositories;

import org.springframework.data.repository.CrudRepository;
import petdata.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
