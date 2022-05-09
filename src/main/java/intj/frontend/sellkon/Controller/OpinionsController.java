package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.Service.OpinionService;
import intj.frontend.sellkon.model.OpinionsModel;
import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.repository.OpinionsRepository;
import intj.frontend.sellkon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/opinions")

public class OpinionsController {

    @Autowired
    private OpinionService opinionService;

    @Autowired
    private OpinionsRepository opinionsRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/opinionsProduct/{id}")
    public List<OpinionsModel> getOpinionToProduct(@PathVariable Long id){
        return opinionService.getOpinionToProduct(id);
    }

    @PostMapping("/{productID}")
    public ResponseEntity<OpinionsModel> addopinion(@PathVariable Long productID,
                                                   @RequestBody OpinionsModel opinionsDetails) {

        OpinionsModel opinionsModel = productRepository.findById(productID).map(product -> {
            opinionsDetails.setProductModel(product);
            return opinionsRepository.save(opinionsDetails);
        }).orElseThrow(() -> new RuntimeException("Fail "));
        return new ResponseEntity<>(opinionsModel, HttpStatus.CREATED);
    }
}
