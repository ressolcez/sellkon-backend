package intj.frontend.sellkon.Service;


import intj.frontend.sellkon.model.OpinionsModel;
import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.model.UserModel;
import intj.frontend.sellkon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserModel getUserById(Long userID){
        return userRepository.findById(userID).orElseThrow(() -> new RuntimeException("Blad" ));

    }
}
