package intj.frontend.sellkon.repository;

import intj.frontend.sellkon.model.OpinionsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface OpinionsRepository extends JpaRepository<OpinionsModel,Long> {
    @Query(value = "select * from opinie where opinie.product_id = :Product_id", nativeQuery = true)
    List<OpinionsModel> getOpinionToProduct(Long Product_id);
}
