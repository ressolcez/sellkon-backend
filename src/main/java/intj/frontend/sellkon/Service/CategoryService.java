package intj.frontend.sellkon.Service;


import intj.frontend.sellkon.model.CategoryModel;
import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.repository.CategoryRespository;
import intj.frontend.sellkon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRespository categoryRespository;

    public List<CategoryModel> getCategory(){
        return categoryRespository.findAll();
    }

}
