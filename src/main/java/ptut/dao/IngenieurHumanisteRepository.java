package ptut.dao;

import ptut.entity.IngenieurHumaniste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngenieurHumanisteRepository extends JpaRepository<IngenieurHumaniste, String> {
}
