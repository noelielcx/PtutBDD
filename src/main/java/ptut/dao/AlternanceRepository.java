package ptut.dao;

import ptut.entity.Alternance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlternanceRepository extends JpaRepository<Alternance, String> {
}
