package intj.frontend.sellkon.Service;

import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.repository.CategoryRespository;
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

    @Autowired
    private CategoryRespository categoryRespository;

    public List<ProductModel> getSliderContent(){
        return productRepository.getSliderContent(1);
    }

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }

    public List<ProductModel> getRecommendedProducts(){
        return productRepository.getRecommendedProducts();
    }

    public List<ProductModel> getCategory1(){
        return productRepository.getCategory1();
    }


    public List<ProductModel> getSpecialOfferContent(){
        return productRepository.getSpecialOfferContent(1);
    }

    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long id) {
        ProductModel productModel = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Blad " + id));
        productRepository.delete(productModel);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<ProductModel> getProductById(@PathVariable Long id) {
        ProductModel productModel = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Blad" + id));
        return ResponseEntity.ok(productModel);
    }

    public ResponseEntity<ProductModel> addProduct(@PathVariable Long id,
                                                   @RequestBody ProductModel productDetails){
        ProductModel productModel = categoryRespository.findById(id).map(category -> {
            productDetails.setCategoryModel(category);
            return productRepository.save(productDetails);
        }).orElseThrow(() -> new RuntimeException("Fail "));

        return new ResponseEntity<>(productModel,HttpStatus.CREATED);

    }

    public ResponseEntity<ProductModel> updateProduct(@PathVariable long id, long categoryId, @RequestBody ProductModel productDetails) {
        ProductModel updateProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Fail " + id));

        updateProduct.setFullDescription(productDetails.getFullDescription());
        updateProduct.setImage(productDetails.getImage());
        updateProduct.setNewPrice(productDetails.getNewPrice());
        updateProduct.setPrice(productDetails.getPrice());
        updateProduct.setShortDesc(productDetails.getShortDesc());
        updateProduct.setShortName(productDetails.getShortName());
        updateProduct.setProductName(productDetails.getProductName());
        updateProduct.setSlider(productDetails.getSlider());
        updateProduct.setSpecialOffer(productDetails.getSpecialOffer());

        categoryRespository.findById(categoryId).map(category -> {
            updateProduct.setCategoryModel(category);
            return productRepository.save(updateProduct);
        }).orElseThrow(() -> new RuntimeException("Fail "));

        return ResponseEntity.ok(updateProduct);
    }




}
