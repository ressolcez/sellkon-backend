package intj.frontend.sellkon.Service;

import intj.frontend.sellkon.model.OpinionsModel;
import intj.frontend.sellkon.repository.OpinionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionService {

    @Autowired
    OpinionsRepository opinionsRepository;
    public List<OpinionsModel> getOpinionToProduct(Long id){
       return opinionsRepository.getOpinionToProduct(id);
    }
}
