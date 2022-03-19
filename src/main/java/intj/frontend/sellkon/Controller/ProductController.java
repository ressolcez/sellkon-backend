package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.Service.ProductService;
import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/slider")
    public List<ProductModel> getSliderContent(){
        return productService.getSliderContent();
    }

    @GetMapping("/AllProducts")
    public  List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable Long id) {return productService.getProductById(id);}

    @GetMapping("/Recommended")
    public List<ProductModel> getRecommendedProducts(){
        return productService.getRecommendedProducts();
    }

    @PostMapping
    public ProductModel addProduct(@RequestBody ProductModel productModel) {return productService.addProduct(productModel);}

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {return productService.deleteEmployee(id);}
}
