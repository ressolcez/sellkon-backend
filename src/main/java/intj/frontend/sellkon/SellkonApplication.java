package intj.frontend.sellkon;

import intj.frontend.sellkon.model.SliderModel;
import intj.frontend.sellkon.repository.SliderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RequestMapping("/db")
public class SellkonApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SellkonApplication.class, args);
	}

	@Autowired
	private SliderRepository sliderRepository;


}






