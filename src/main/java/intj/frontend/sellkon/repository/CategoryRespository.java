package intj.frontend.sellkon.repository;

import intj.frontend.sellkon.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CategoryRespository extends JpaRepository<CategoryModel,Long> {

    @Modifying
    @Transactional
    @Query(value = "delete from products where category_id = :categoryId", nativeQuery = true)
    void deleteProductFromCategory(Long categoryId);

    @Modifying
    @Transactional
    @Query(value = "delete from category where category_id = :categoryId", nativeQuery = true)
    void deleteCategory(Long categoryId);

}
