package intj.frontend.sellkon;

import intj.frontend.sellkon.model.CategoryModel;
import intj.frontend.sellkon.model.ProductModel;
import intj.frontend.sellkon.repository.CategoryRespository;
import intj.frontend.sellkon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/db")
public class SellkonApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SellkonApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRespository categoryRespository;


	@Override
	public void run(String... args) throws Exception {

		CategoryModel categoryModel = new CategoryModel();
		categoryModel.setCateGoryName("Komputery");
		categoryModel.setImage("https://media.istockphoto.com/photos/modern-office-desk-background-top-view-with-copy-space-picture-id1133856693?b=1&k=20&m=1133856693&s=170667a&w=0&h=_7xjXLQMZNuqwTnXnJZaBmYX3z3QNZ8opUcf0sLAG5M=");
		categoryRespository.save(categoryModel);

		CategoryModel categoryModel2= new CategoryModel();
		categoryModel2.setCateGoryName("Laptopy");
		categoryModel2.setImage("https://media.istockphoto.com/photos/working-space-background-picture-id513132398?k=20&m=513132398&s=612x612&w=0&h=LEa66QsVRXaFLWG4IJnGxceRycMH0zpJgBQ_WCNk_zM=");
		categoryRespository.save(categoryModel2);


		ProductModel productModel = new ProductModel();
		productModel.setFullDescription("Acer Swift 3 i5-1135G7/16GB/512/W11 Srebrny Intel Evo");
		productModel.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/10/pr_2021_10_8_14_22_27_699_08.jpg");
		productModel.setNewPrice(4500);
		productModel.setPrice(4800);
		productModel.setShortDesc("Jestem krotkim opisem reprezentujacym poszczegolne obiekty v1");
		productModel.setShortName("Acer Swift 3 i5-1135G7/16GB/512/W11");
		productModel.setProductName("Acer Swift 3 i5-1135G7/16GB/512/W11 Srebrny Intel Evo");
		productModel.setSlider(Boolean.TRUE);
		productModel.setSpecialOffer(Boolean.TRUE);
		productModel.setCategoryModel(categoryModel);
		productRepository.save(productModel);

		ProductModel productModel2 = new ProductModel();
		productModel2.setFullDescription("Komputery G4M3R HERO zaprojektowaliśmy tak, by rozgrywka była płynna przy wysokich detalach. Wybraliśmy komponenty, które najlepiej do siebie pasują, dzięki czemu zachowują niskie temperatury i cichą pracę. Osiągnęliśmy to dzięki autorskim rozwiązaniom i tysiącom testów.");
		productModel2.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/11/pr_2021_11_16_14_29_58_501_02.jpg");
		productModel2.setShortDesc("Jestem krotkim opisem reprezentujacym poszczegolne obiekty v2");
		productModel2.setShortName("G4M3R HERO i5-11400F");
		productModel2.setNewPrice(5000);
		productModel2.setPrice(5600);
		productModel2.setProductName("G4M3R HERO i5-11400F/16GB/1TB/RTX2060/W11x");
		productModel2.setSlider(Boolean.TRUE);
		productModel2.setSpecialOffer(Boolean.TRUE);
		productModel2.setCategoryModel(categoryModel);
		productRepository.save(productModel2);

		ProductModel productModel3 = new ProductModel();
		productModel3.setFullDescription("Komputery G4M3R HERO zaprojektowaliśmy tak, by rozgrywka była płynna przy wysokich detalach. Wybraliśmy komponenty, które najlepiej do siebie pasują, dzięki czemu zachowują niskie temperatury i cichą pracę. Osiągnęliśmy to dzięki autorskim rozwiązaniom i tysiącom testów.");
		productModel3.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2018/7/pr_2018_7_23_8_51_26_666_06.jpg");
		productModel3.setNewPrice(5000);
		productModel3.setPrice(5600);
		productModel3.setProductName("G4M3R HERO i5-11400F/16GB/1TB/RTX2060/W11x");
		productModel3.setShortDesc("Jestem krotkim opisem reprezentujacym poszczegolne obiekty v3");
		productModel3.setShortName("G4M3R HERO i5-11400F");
		productModel3.setSlider(Boolean.TRUE);
		productModel3.setSpecialOffer(Boolean.TRUE);
		productModel3.setCategoryModel(categoryModel2);

		productRepository.save(productModel3);

		ProductModel productModel4 = new ProductModel();
		productModel4.setFullDescription("Komputery G4M3R HERO zaprojektowaliśmy tak, by rozgrywka była płynna przy wysokich detalach. Wybraliśmy komponenty, które najlepiej do siebie pasują, dzięki czemu zachowują niskie temperatury i cichą pracę. Osiągnęliśmy to dzięki autorskim rozwiązaniom i tysiącom testów.");
		productModel4.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/10/pr_2021_10_18_21_13_10_396_00.jpg");
		productModel4.setNewPrice(5000);
		productModel4.setPrice(5600);
		productModel4.setShortDesc("Jestem krotkim opisem reprezentujacym poszczegolne obiekty v3");
		productModel4.setShortName("G4M3R HERO i5-11400F");
		productModel4.setProductName("G4M3R HERO i5-11400F/16GB/1TB/RTX2060/W11x");
		productModel4.setSlider(Boolean.FALSE);
		productModel4.setSpecialOffer(Boolean.FALSE);
		productModel4.setCategoryModel(categoryModel2);
		productRepository.save(productModel4);

	}

}






