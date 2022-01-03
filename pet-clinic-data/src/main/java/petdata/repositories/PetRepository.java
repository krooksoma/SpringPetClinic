package petdata.repositories;
import org.springframework.data.repository.CrudRepository;
import petdata.domain.Pet;


public interface PetRepository extends CrudRepository<Pet, Long> {
}
