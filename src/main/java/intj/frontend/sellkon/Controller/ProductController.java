package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.Service.ProductService;
import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.repository.CategoryRespository;
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

    @Autowired
    CategoryRespository categoryRespository;

    @GetMapping("/slider")
    public List<ProductModel> getSliderContent(){
        return productService.getSliderContent();
    }

    @GetMapping("/AllProducts")
    public  List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/ProductsFromCategory/{categoryId}")
    public  List<ProductModel> getProductsFromCategory(@PathVariable Long categoryId){
        return productService.getCategory1(categoryId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable Long id) {return productService.getProductById(id);}

    @GetMapping("/Recommended")
    public List<ProductModel> getRecommendedProducts(){
        return productService.getRecommendedProducts();
    }

    @GetMapping("/SpecialOffer")
    public List<ProductModel> getSpecialOfferContent(){
        return productService.getSpecialOfferContent();
    }

    @PostMapping("/{id}")
    public ResponseEntity<ProductModel> addProduct(@PathVariable Long id,
                                                   @RequestBody ProductModel productDetails) {
        return productService.addProduct(id,productDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long id) {return productService.deleteProduct(id);}

    @PutMapping("/{id}/{categoryId}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable long id,@PathVariable long categoryId,@RequestBody ProductModel productDetails) {
        return productService.updateProduct(id,categoryId,productDetails);

    }
}
