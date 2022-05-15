package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.model.UserModel;
import intj.frontend.sellkon.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/Allusers")
    public List<UserModel > getAllProducts(){
        return userRepository.findAll();
    }

    @PostMapping()
    public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userModel) {

        userRepository.save(userModel);
        return new ResponseEntity<>(userModel, HttpStatus.CREATED);
    }


}
