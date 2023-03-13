package ptut.dao;


import ptut.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import ptut.entity.Promotion;

public interface PromotionRepository extends JpaRepository<Promotion, String> {


}
