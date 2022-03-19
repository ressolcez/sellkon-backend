package intj.frontend.sellkon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "Products")
public class ProductModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "Category")
    private String category;

    @Column(name = "ProductName")
    @Lob
    private String productName;

    @Column(name = "ShortName")
    private String shortName;

    @Column(name = "Price")
    private int price;

    @Column(name = "Slider")
    private Boolean slider;

    @Column(name = "SpecialOffer")
    private Boolean specialOffer;

    @Column(name = "NewPrice")
    private int newPrice;

    @Column(name = "ShortDesc")
    private String shortDesc;

    @Column(name = "FullDescription")
    @Lob
    private String fullDescription;

    @Column(name = "Image")
    @Lob
    private String image;

    public ProductModel(String category,String productName,String shortName,int price,Boolean slider, Boolean specialOffer, int newPrice, String shortDesc, String fullDescription, String image){
        this.category = category;
        this.productName = productName;
        this.shortName = shortName;
        this.price = price;
        this.slider = slider;
        this.specialOffer = specialOffer;
        this.newPrice = newPrice;
        this.shortDesc = shortDesc;
        this.fullDescription = fullDescription;
        this.image = image;
    }

    public ProductModel(){

    }
}
