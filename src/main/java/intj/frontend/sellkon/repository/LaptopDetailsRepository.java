package intj.frontend.sellkon.repository;

import intj.frontend.sellkon.model.LaptopDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDetailsRepository extends JpaRepository<LaptopDetailsModel,Long> {
}
