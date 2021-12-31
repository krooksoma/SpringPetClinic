package petdata.services;

import org.springframework.data.repository.CrudRepository;
import petdata.domain.Visit;

public interface VisitService extends CrudRepository<Visit, Long> {
}
