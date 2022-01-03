package petdata.repositories;
import org.springframework.data.repository.CrudRepository;
import petdata.domain.Veterinarian;

public interface VetRepository extends CrudRepository<Veterinarian, Long> {
}
