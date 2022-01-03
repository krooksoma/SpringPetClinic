package petdata.services;

import org.springframework.data.repository.CrudRepository;
import petdata.domain.Visit;

public interface VisitService extends CrudService<Visit, Long> {
}
