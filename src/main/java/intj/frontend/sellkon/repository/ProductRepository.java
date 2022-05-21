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

    @Query(value = "select * from products where products.special_offer = false and products.slider = false order by Rand() asc limit 20", nativeQuery = true)
    List<ProductModel> getRecommendedProducts();

    @Query(value = "select * from products where special_offer = :SpecialOfferState", nativeQuery = true)
    List<ProductModel> getSpecialOfferContent(Integer SpecialOfferState);

    @Query(value = "select * from products where category_id = :categoryId", nativeQuery = true)
    List<ProductModel> getProductFromCategory(Long categoryId);

    @Query(value = "select * from products where products.category_id = :categoryId and products.price BETWEEN :minPrice and :maxPrice", nativeQuery = true)
    List<ProductModel> getProductsFromCategoryFilteredByPrice(long categoryId, long minPrice, long maxPrice);

}
