package intj.frontend.sellkon.Controller;

import intj.frontend.sellkon.model.SliderModel;
import intj.frontend.sellkon.repository.SliderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class SliderController {

    @Autowired
    private SliderRepository sliderRepository;

    @GetMapping
    public List<SliderModel> getAllSliderData(){
        return sliderRepository.findAll();
    }

}
