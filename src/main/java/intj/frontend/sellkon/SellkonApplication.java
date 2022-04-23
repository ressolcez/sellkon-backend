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
public class SellkonApplication implements CommandLineRunner{

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
		categoryModel.setImage("https://images.unsplash.com/photo-1624705013726-8cb4f9415f40?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2Nlc3NvcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
		categoryRespository.save(categoryModel);

		CategoryModel categoryModel2= new CategoryModel();
		categoryModel2.setCateGoryName("Laptopy");
		categoryModel2.setImage("https://images.unsplash.com/photo-1563120425-aacf863ea7b3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80");
		categoryRespository.save(categoryModel2);

		CategoryModel categoryModel3= new CategoryModel();
		categoryModel3.setCateGoryName("Telefony");
		categoryModel3.setImage("https://images.unsplash.com/photo-1517765371796-5bd3a7d30a29?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjQ3fHxzbWFydHBob25lc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
		categoryRespository.save(categoryModel3);

		CategoryModel categoryModel4= new CategoryModel();
		categoryModel4.setCateGoryName("Monitory");
		categoryModel4.setImage("https://images.unsplash.com/photo-1599404062969-0a81537dfd80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTQ1fHxjb21wdXRlciUyMG1vbml0b3J8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60");
		categoryRespository.save(categoryModel4);

		CategoryModel categoryModel5= new CategoryModel();
		categoryModel5.setCateGoryName("Klawiatury");
		categoryModel5.setImage("https://images.pexels.com/photos/4792731/pexels-photo-4792731.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
		categoryRespository.save(categoryModel5);

		CategoryModel categoryModel6= new CategoryModel();
		categoryModel6.setCateGoryName("Myszki");
		categoryModel6.setImage("https://images.unsplash.com/photo-1616071359129-9b03697771a8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NjB8fGNvbXB1dGVyJTIwbW91c2V8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60");
		categoryRespository.save(categoryModel6);

		CategoryModel categoryModel7= new CategoryModel();
		categoryModel7.setCateGoryName("Podzespoły komputerowe");
		categoryModel7.setImage("https://images.unsplash.com/photo-1635680849527-7bd11fb14879?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTI5fHxwcm9jZXNzb3J8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60");
		categoryRespository.save(categoryModel7);

		CategoryModel categoryModel8= new CategoryModel();
		categoryModel8.setCateGoryName("Słuchawki");
		categoryModel8.setImage("https://images.unsplash.com/photo-1585298723682-7115561c51b7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8aGVhZHBob25lc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
		categoryRespository.save(categoryModel8);

		CategoryModel categoryModel9= new CategoryModel();
		categoryModel9.setCateGoryName("Tablety");
		categoryModel9.setImage("https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fHRhYmxldHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60");
		categoryRespository.save(categoryModel9);


		ProductModel productModel = new ProductModel();
		productModel.setFullDescription("Wydajny, elegancki, stworzony z myślą o graczach – laptop Dell Inspiron G15 wprowadzi Cię na wyższy poziom rozgrywek e-sportowych. Nowoczesny, potężny procesor wspomagany przez ultraszybką pamięć i kartę graficzną pozwoli Ci wyzwolić moc, którą przekujesz na zwycięstwa w wirtualnych bataliach. Ciesz się nieprzeciętną wydajnością i wejdź na wyższy level grania, dzięki niezwykłym technologiom zastosowanym w laptopie Dell Inspiron G15.");
		productModel.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/7/pr_2021_7_19_8_38_49_295_01.jpg");
		productModel.setNewPrice(3999.00);
		productModel.setPrice(4299.00);
		productModel.setShortDesc("Poznaj laptopa Dell G15, następcę kultowych modeli G3 i G5, o 15-calowym ekranie i odświeżaniu do 120 Hz.");
		productModel.setShortName("Dell Inspiron G15 5511");
		productModel.setProductName("Dell Inspiron G15 5511 i5-11400H/16GB/512/Win11 RTX3050");
		productModel.setSlider(Boolean.TRUE);
		productModel.setSpecialOffer(Boolean.FALSE);
		productModel.setCategoryModel(categoryModel2);
		productRepository.save(productModel);

		ProductModel productModel2 = new ProductModel();
		productModel2.setFullDescription("Pracuj, oglądaj ulubione filmy i seriale, dziel się wrażeniami ze swoimi przyjaciółmi. Z ultramobilnym Dell Inspiron 5310 zrobisz to, gdziekolwiek się znajdujesz. Jest lekki, niewielki i tylko czeka, aż zabierzesz go ze sobą w podróże małe i duże.");
		productModel2.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2022/1/pr_2022_1_24_12_10_21_462_00.jpg");
		productModel2.setShortDesc("Elegancko wykończony, efektowny, a jednocześnie minimalistyczny. Dell Inspiron 5310 to laptop, który otwiera przed Tobą mobilne wrota, za którymi mnożą się nieskończone możliwości");
		productModel2.setShortName("Dell Inspiron 5310 i7-11390H");
		productModel2.setNewPrice(4499.00);
		productModel2.setPrice(4999.00);
		productModel2.setProductName("Dell Inspiron 5310 i7-11390H/16GB/512/Win11");
		productModel2.setSlider(Boolean.FALSE);
		productModel2.setSpecialOffer(Boolean.TRUE);
		productModel2.setCategoryModel(categoryModel2);
		productRepository.save(productModel2);

		ProductModel productModel3 = new ProductModel();
		productModel3.setFullDescription("Tryb Eye Saver redukuje emisję światła niebieskiego, które pobudza wzrok znacznie bardziej, niż inne kolory. Tryb ten sprawia, że korzystanie z monitora staje się znacznie bardziej komfortowe. Technologia Flicker Free eliminuje rozpraszające migotanie ekranu, co zwiększy Twój komfort podczas wielogodzinnej pracy i rozrywki.");
		productModel3.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2022/1/pr_2022_1_21_16_9_4_493_00.jpg");
		productModel3.setNewPrice(600.00);
		productModel3.setPrice(0);
		productModel3.setProductName("G4M3R HERO i5-11400F/16GB/1TB/RTX2060/W11x");
		productModel3.setShortDesc("Dzięki większemu promieniu zakrzywienia wzrok męczy się mniej, niż podczas korzystania z płaskich monitorów. Sprawia on też, że oczy są w takiej samej odległości od każdego punktu na ekranie.");
		productModel3.setShortName("Samsung C24F390FHRX");
		productModel3.setSlider(Boolean.FALSE);
		productModel3.setSpecialOffer(Boolean.FALSE);
		productModel3.setCategoryModel(categoryModel4);
		productRepository.save(productModel3);

		ProductModel productModel4 = new ProductModel();
		productModel4.setFullDescription("Zaprojektowaliśmy nowe wnętrze komputera, które ma lepszy przepływ powietrza. Dzięki temu temperatury podzespołów są mniejsze, a praca jest cichsza. To gwarantuje mniejszy pobór energii w porównaniu ze starszą generacją i jeszcze stabilniejsze działanie.");
		productModel4.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/11/pr_2021_11_16_14_29_54_486_00.jpg");
		productModel4.setNewPrice(8300.00);
		productModel4.setPrice(9500.00);
		productModel4.setShortDesc("Komputery G4M3R HERO zaprojektowaliśmy tak, by rozgrywka była płynna przy wysokich detalach. Wybraliśmy komponenty, które najlepiej do siebie pasują, dzięki czemu zachowują niskie temperatury i cichą pracę.");
		productModel4.setShortName("G4M3R HERO i7-11700F");
		productModel4.setProductName("G4M3R HERO i7-11700F/16GB/1TB/RTX3060Ti/W11x");
		productModel4.setSlider(Boolean.TRUE);
		productModel4.setSpecialOffer(Boolean.FALSE);
		productModel4.setCategoryModel(categoryModel);
		productRepository.save(productModel4);

		ProductModel productModel5 = new ProductModel();
		productModel5.setFullDescription("11 Lite 5G NE podtrzymuje tradycje dobrych technologii fotograficznych znanych ze smartfonów Xiaomi. To idealny wybór dla ludzi ceniących sobie dobry styl. Potrójny aparat z matrycą główną 64 Mpix, obiektyw ultraszerokokątny i telemakro tylko czekają na okazje do zrobienia niepowtarzalnych zdjęć. Wykorzystaj je i uwiecznij każdą wyjątkową chwilę. Z trybem nocnym fotografie nawet po zmroku będą wyraźne. Czarny Xiaomi 11 Lite 5G NE zapewnia Ci najlepsze parametry spośród wszystkich modeli w wersji Lite.");
		productModel5.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/10/pr_2021_10_7_16_53_18_347_01.jpg");
		productModel5.setNewPrice(1500.00);
		productModel5.setPrice(1800.00);
		productModel5.setShortDesc("Najsmuklejszy smartfon w portfolio Xiaomi z obsługą łączności 5G, a grubość jego ramek to zaledwie 1,88 mm. Nie wpłynęło to w żaden sposób negatywnie na jego parametry i możliwości.");
		productModel5.setShortName("Xiaomi 11 Lite 5G NE 6/128GB");
		productModel5.setProductName("Xiaomi 11 Lite 5G NE 6/128GB Truffle Black");
		productModel5.setSlider(Boolean.TRUE);
		productModel5.setSpecialOffer(Boolean.FALSE);
		productModel5.setCategoryModel(categoryModel3);
		productRepository.save(productModel5);

		ProductModel productModel6 = new ProductModel();
		productModel6.setFullDescription(" ");
		productModel6.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/12/pr_2021_12_17_13_37_14_360_00.jpg");
		productModel6.setNewPrice(5499.00);
		productModel6.setPrice(0);
		productModel6.setShortDesc("Wydajny, elegancki, stworzony z myślą o graczach – komputer Acer Nitro 50 wprowadzi Cię na wyższy poziom rozgrywek e-sportowych");
		productModel6.setShortName("Acer Nitro 50 i5-11400F");
		productModel6.setProductName("Acer Nitro 50 i5-11400F/16GB/512 RTX3060Ti");
		productModel6.setSlider(Boolean.FALSE);
		productModel6.setSpecialOffer(Boolean.FALSE);
		productModel6.setCategoryModel(categoryModel);
		productRepository.save(productModel6);

		ProductModel productModel7 = new ProductModel();
		productModel7.setFullDescription("");
		productModel7.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-medium,,2020/10/pr_2020_10_7_12_14_30_145_00.jpg");
		productModel7.setNewPrice(2999.00);
		productModel7.setPrice(0);
		productModel7.setShortDesc("Z nowym desktopem Dell Vostro 3888 MT Twoje codzienne obowiązki będą wykonywane płynnie i bez dodatkowych opóźnień. To dzięki nowoczesnemu procesorowi wspomaganemu zintegrowaną kartą graficzną.");
		productModel7.setShortName("Dell Vostro 3888 MT i5-10400");
		productModel7.setProductName("Dell Vostro 3888 MT i5-10400/16GB/480+1TB/Win11P");
		productModel7.setSlider(Boolean.FALSE);
		productModel7.setSpecialOffer(Boolean.FALSE);
		productModel7.setCategoryModel(categoryModel);
		productRepository.save(productModel7);

		ProductModel productModel8 = new ProductModel();
		productModel8.setFullDescription("");
		productModel8.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/11/pr_2021_11_26_11_22_58_503_00.jpg");
		productModel8.setNewPrice(3399.00);
		productModel8.setPrice(3799.00);
		productModel8.setShortDesc("Znakomite osiągi CPU pozwalają na płynną rozgrywkę z nowymi grami, strumieniowanie multimediów oraz pracę z wymagającymi programami");
		productModel8.setShortName("HP Pavilion Gaming R5");
		productModel8.setProductName("HP Pavilion Gaming R5/16GB/512/Win10 GTX1650 Super");
		productModel8.setSlider(Boolean.FALSE);
		productModel8.setSpecialOffer(Boolean.TRUE);
		productModel8.setCategoryModel(categoryModel);
		productRepository.save(productModel8);

		ProductModel productModel9 = new ProductModel();
		productModel9.setFullDescription("");
		productModel9.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/9/pr_2021_9_21_10_6_33_198_00.jpg");
		productModel9.setNewPrice(3950.00);
		productModel9.setPrice(4100.00);
		productModel9.setShortDesc("Dołącz do elity wybierając komputer gamingowy Lenovo IdeaCentre Gaming 5. Precyzyjnie dobrane podzespoły zaopatrzą Cię w moc niezbędną do działania i odnoszenia sukcesów w rozgrywkach e-sportowych.");
		productModel9.setShortName("Lenovo IdeaCentre Gaming 5 i5");
		productModel9.setProductName("Lenovo IdeaCentre Gaming 5 i5/16GB/512/Win10 GTX1650S");
		productModel9.setSlider(Boolean.FALSE);
		productModel9.setSpecialOffer(Boolean.TRUE);
		productModel9.setCategoryModel(categoryModel);
		productRepository.save(productModel9);

		ProductModel productModel10 = new ProductModel();
		productModel10.setFullDescription("");
		productModel10.setImage("https://allegro.stati.pl/AllegroIMG/PRODUCENCI/DELL/dell-alienware-aurora/dell-alienware-aurora.jpg");
		productModel10.setNewPrice(15550);
		productModel10.setPrice(16699);
		productModel10.setShortDesc("Brakuje mocy? Wybierając Dell Alienware Aurora, już nie musisz się martwić o wydajność w grach. Agresywnie wyglądająca obudowa skrywa w sobie potężne zaplecze technologiczne. Precyzyjnie dobrane podzespoły zapewnią Ci nieprzeciętne możliwości. ");
		productModel10.setShortName("Dell Alienware Aurora R10 R7");
		productModel10.setProductName("Dell Alienware Aurora R10 R7/16GB/512+1TB/W11 RTX3090");
		productModel10.setSlider(Boolean.FALSE);
		productModel10.setSpecialOffer(Boolean.TRUE);
		productModel10.setCategoryModel(categoryModel);
		productRepository.save(productModel10);

		ProductModel productModel11 = new ProductModel();
		productModel11.setFullDescription("");
		productModel11.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/7/pr_2021_7_21_11_6_58_174_03.jpg");
		productModel11.setNewPrice(1499);
		productModel11.setPrice(1699);
		productModel11.setShortDesc("Zachwycający design oraz niezwykle bogata funkcjonalność – to czyni z monitora LG 27GP850-B narzędzie, dzięki któremu odkryjesz gaming na nowo. ");
		productModel11.setShortName("Dell Alienware Aurora R10 R7");
		productModel11.setProductName("Dell Alienware Aurora R10 R7/16GB/512+1TB/W11 RTX3090");
		productModel11.setSlider(Boolean.FALSE);
		productModel11.setSpecialOffer(Boolean.TRUE);
		productModel11.setCategoryModel(categoryModel4);
		productRepository.save(productModel11);

		ProductModel productModel12 = new ProductModel();
		productModel12.setFullDescription("");
		productModel12.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/12/pr_2021_12_20_10_4_13_329_03.jpg");
		productModel12.setNewPrice(1499);
		productModel12.setPrice(0);
		productModel12.setShortDesc("Zachwycający design oraz niezwykle bogata funkcjonalność – to czyni z monitora AOC 24G2SU narzędzie, dzięki któremu odkryjesz gaming na nowo.");
		productModel12.setShortName("AOC 24G2SU Gaming");
		productModel12.setProductName("AOC 24G2SU Gaming");
		productModel12.setSlider(Boolean.FALSE);
		productModel12.setSpecialOffer(Boolean.FALSE);
		productModel12.setCategoryModel(categoryModel4);
		productRepository.save(productModel12);

		ProductModel productModel13 = new ProductModel();
		productModel13.setFullDescription("");
		productModel13.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/10/pr_2021_10_8_8_25_9_122_03.jpg");
		productModel13.setNewPrice(599);
		productModel13.setPrice(0);
		productModel13.setShortDesc("Monitor Acer SB241Y to połączenie stylu i funkcjonalności z niskim zużyciem energii. Idealnie dopełni Twoje biuro lub domowe stanowisko. Wyposażony został w panel Full HD, który zapewni Ci wygodny przegląd grafik i multimediów.");
		productModel13.setShortName("Acer SB241Y");
		productModel13.setProductName("Acer SB241Y");
		productModel13.setSlider(Boolean.FALSE);
		productModel13.setSpecialOffer(Boolean.FALSE);
		productModel13.setCategoryModel(categoryModel4);
		productRepository.save(productModel13);

		ProductModel productModel14 = new ProductModel();
		productModel14.setFullDescription("");
		productModel14.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2020/9/pr_2020_9_2_11_10_57_978_00.jpg");
		productModel14.setNewPrice(1869);
		productModel14.setPrice(0);
		productModel14.setShortDesc("Monitor Acer SB241Y to połączenie stylu i funkcjonalności z niskim zużyciem energii. Idealnie dopełni Twoje biuro lub domowe stanowisko. Wyposażony został w panel Full HD, który zapewni Ci wygodny przegląd grafik i multimediów.");
		productModel14.setShortName("Dell S2721DGFA nanoIPS");
		productModel14.setProductName("Dell S2721DGFA nanoIPS HDR");
		productModel14.setSlider(Boolean.FALSE);
		productModel14.setSpecialOffer(Boolean.FALSE);
		productModel14.setCategoryModel(categoryModel4);
		productRepository.save(productModel14);

		ProductModel productModel15 = new ProductModel();
		productModel15.setFullDescription("");
		productModel15.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2020/12/pr_2020_12_1_11_9_42_430_00.jpg");
		productModel15.setNewPrice(599);
		productModel15.setPrice(839);
		productModel15.setShortDesc("Monitor Acer SB241Y to połączenie stylu i funkcjonalności z niskim zużyciem energii. Idealnie dopełni Twoje biuro lub domowe stanowisko. Wyposażony został w panel Full HD, który zapewni Ci wygodny przegląd grafik i multimediów.");
		productModel15.setShortName("MSI PRO MP242");
		productModel15.setProductName("MSI PRO MP242");
		productModel15.setSlider(Boolean.FALSE);
		productModel15.setSpecialOffer(Boolean.TRUE);
		productModel15.setCategoryModel(categoryModel4);
		productRepository.save(productModel15);

		ProductModel productModel16 = new ProductModel();
		productModel16.setFullDescription("");
		productModel16.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/8/pr_2021_8_16_7_22_26_389_00.jpg");
		productModel16.setNewPrice(3200);
		productModel16.setPrice(3349);
		productModel16.setShortDesc("Gotuj się do walki. Gamingowy laptop ASUS TUF Gaming F15 wprowadzi Cię na pola wirtualnych bitew, oddając do dyspozycji arsenał, który poprowadzi Cię do niezliczonych zwycięstw.");
		productModel16.setShortName("ASUS TUF Gaming F15 i5-10300H");
		productModel16.setProductName("ASUS TUF Gaming F15 i5-10300H/32GB/512 GTX1650");
		productModel16.setSlider(Boolean.FALSE);
		productModel16.setSpecialOffer(Boolean.TRUE);
		productModel16.setCategoryModel(categoryModel2);
		productRepository.save(productModel16);

		ProductModel productModel17 = new ProductModel();
		productModel17.setFullDescription("");
		productModel17.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/8/pr_2021_8_16_14_21_14_702_00.jpg");
		productModel17.setNewPrice(5220);
		productModel17.setPrice(0);
		productModel17.setShortDesc("Wydajny, elegancki, stworzony z myślą o graczach – laptop HP Victus wprowadzi Cię na wyższy poziom rozgrywek e-sportowych. Nowoczesny, potężny procesor wspomagany przez ultraszybką pamięć i kartę graficzną pozwoli Ci wyzwolić prawdziwą moc");
		productModel17.setShortName("HP Victus Ryzen 7-5800H");
		productModel17.setProductName("HP Victus Ryzen 7-5800H/32GB/512 RTX3060 144Hz");
		productModel17.setSlider(Boolean.FALSE);
		productModel17.setSpecialOffer(Boolean.FALSE);
		productModel17.setCategoryModel(categoryModel2);
		productRepository.save(productModel17);

		ProductModel productModel18 = new ProductModel();
		productModel18.setFullDescription("");
		productModel18.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/11/pr_2021_11_30_14_15_12_750_00.jpg");
		productModel18.setNewPrice(5649);
		productModel18.setPrice(0);
		productModel18.setShortDesc("Zanurz się w gamingowych światach i podziwiaj je przez pryzmat technologii Ray Tracingu z kartą graficzną GeForce RTX. Razem z nowoczesnym procesorem tworzą duet, który pozwoli Ci wejść na wyższy poziom grania.");
		productModel18.setShortName("Acer Nitro 5 R5-5600H");
		productModel18.setProductName("Acer Nitro 5 R5-5600H/16GB/1TB/Win11PX RTX3060 144Hz");
		productModel18.setSlider(Boolean.FALSE);
		productModel18.setSpecialOffer(Boolean.FALSE);
		productModel18.setCategoryModel(categoryModel2);
		productRepository.save(productModel18);

        ProductModel productModel19 = new ProductModel();
        productModel19.setFullDescription("");
        productModel19.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/4/pr_2021_4_8_14_33_32_557_04.png");
        productModel19.setNewPrice(189);
        productModel19.setPrice(0);
        productModel19.setShortDesc("O zwycięstwie decydują nie tylko umiejętności, ale także odpowiedni sprzęt. Zapewnij sobie właściwe zaplecze technologiczne i wybierz gamingową klawiaturę Corsair K55 RGB PRO.");
        productModel19.setShortName("Corsair K55 RGB PRO");
        productModel19.setProductName("Corsair K55 RGB PRO");
        productModel19.setSlider(Boolean.FALSE);
        productModel19.setSpecialOffer(Boolean.FALSE);
        productModel19.setCategoryModel(categoryModel5);
        productRepository.save(productModel19);

        ProductModel productModel20 = new ProductModel();
        productModel20.setFullDescription("");
        productModel20.setImage("https://cdn.x-kom.pl/i/setup/images/prod/big/product-new-big,,2021/9/pr_2021_9_24_12_5_53_782_03.jpg");
        productModel20.setNewPrice(200);
        productModel20.setPrice(0);
        productModel20.setShortDesc("Mechaniczna klawiatura KFA2 STEALTH-03 to rozwiązanie dedykowane profesjonalnym gamerom. Zapewnia wyjątkowe efekty wizualne, pełną kontrolę multimediów, wytrzymałość oraz praktyczny design");
        productModel20.setShortName("KFA2 STEALTH-03");
        productModel20.setProductName("KFA2 STEALTH-03");
        productModel20.setSlider(Boolean.FALSE);
        productModel20.setSpecialOffer(Boolean.FALSE);
        productModel20.setCategoryModel(categoryModel5);
        productRepository.save(productModel20);

	}
}






