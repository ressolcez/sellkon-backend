package intj.frontend.sellkon.repository;

import intj.frontend.sellkon.model.ComputerDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerDetailsRepository extends JpaRepository<ComputerDetailsModel,Long> { }
