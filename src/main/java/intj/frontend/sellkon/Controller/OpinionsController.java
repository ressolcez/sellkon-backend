package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.Service.OpinionService;
import intj.frontend.sellkon.Service.UserService;
import intj.frontend.sellkon.model.OpinionsModel;
import intj.frontend.sellkon.model.UserModel;
import intj.frontend.sellkon.repository.OpinionsRepository;
import intj.frontend.sellkon.repository.ProductRepository;
import intj.frontend.sellkon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/opinionsProduct/{id}")
    public List<OpinionsModel> getOpinionToProduct(@PathVariable Long id){
        return opinionService.getOpinionToProduct(id);
    }

    @PostMapping("/{productID}/{userID}")
    public ResponseEntity<OpinionsModel> addopinion(@PathVariable Long productID,@PathVariable Long userID,
                                                   @RequestBody OpinionsModel opinionsDetails) {

        UserModel userModel = userService.getUserById(userID);

        OpinionsModel opinionsModel = productRepository.findById(productID).map(product -> {
            opinionsDetails.setProductModel(product);
            opinionsDetails.setUserModel(userModel);
            return opinionsRepository.save(opinionsDetails);
        }).orElseThrow(() -> new RuntimeException("Fail "));
        return new ResponseEntity<>(opinionsModel, HttpStatus.CREATED);
    }
}
