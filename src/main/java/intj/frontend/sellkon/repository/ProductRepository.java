package intj.frontend.sellkon.repository;

import intj.frontend.sellkon.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Long> {
    @Query(value = "select * from products where slider = :sliderState", nativeQuery = true)
    List<ProductModel> getSliderContent(Integer sliderState);

    @Query(value = "select * from products order by Rand() asc limit 3", nativeQuery = true)
    List<ProductModel> getRecommendedProducts();
}
