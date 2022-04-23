package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.Service.CategoryService;
import intj.frontend.sellkon.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/AllCategory")
    public List<CategoryModel> getAllCategory(){return categoryService.getAllCategory();}

    @PostMapping
    public CategoryModel addCategory(@RequestBody CategoryModel categoryDetails) {return categoryService.addCategory(categoryDetails);}

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long id) {return categoryService.deleteCategory(id);}
}
