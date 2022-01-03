package petdata.repositories;
import org.springframework.data.repository.CrudRepository;
import petdata.domain.Visit;


public interface VisitRepository extends CrudRepository<Visit, Long> {
}
