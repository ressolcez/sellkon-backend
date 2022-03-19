package intj.frontend.sellkon.Service;

import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getSliderContent(){
        return productRepository.getSliderContent(1);
    }

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }

    public List<ProductModel> getRecommendedProducts(){
        return productRepository.getRecommendedProducts();
    }

    public ProductModel addProduct(@RequestBody ProductModel productModel) {return productRepository.save(productModel);}

    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {
        ProductModel productModel = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not exist with id: " + id));
        productRepository.delete(productModel);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<ProductModel> getProductById(@PathVariable Long id) {
        ProductModel productModel = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Blad" + id));
        return ResponseEntity.ok(productModel);
    }

}
