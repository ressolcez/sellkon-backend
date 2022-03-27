package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.Service.CategoryService;
import intj.frontend.sellkon.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/AllCategory")
    public List<CategoryModel> getCategory(){
        return categoryService.getCategory();
    }

}
