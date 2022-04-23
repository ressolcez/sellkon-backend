package intj.frontend.sellkon.Service;

import intj.frontend.sellkon.model.CategoryModel;
import intj.frontend.sellkon.repository.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRespository categoryRespository;

    public List<CategoryModel> getAllCategory(){
        return categoryRespository.findAll();
    }

    public CategoryModel addCategory(@RequestBody CategoryModel categoryDetails){return categoryRespository.save(categoryDetails);}

    public ResponseEntity<HttpStatus> deleteCategory(long id) {
        System.out.println("Tak");
        categoryRespository.deleteProductFromCategory(id);
        categoryRespository.deleteCategory(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    };

}
