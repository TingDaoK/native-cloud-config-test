package nat.cloud.config.test.client.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonService extends CrudRepository<Person,Long> {
}
