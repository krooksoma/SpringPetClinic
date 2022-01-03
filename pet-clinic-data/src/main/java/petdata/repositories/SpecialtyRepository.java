package petdata.repositories;
import org.springframework.data.repository.CrudRepository;
import petdata.domain.Specialty;


public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
