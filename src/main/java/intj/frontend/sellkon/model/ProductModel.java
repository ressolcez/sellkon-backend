package intj.frontend.sellkon.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Products")
public class ProductModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long product_id;

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

    @ManyToOne
    @JoinColumn(name="category_id")
    private CategoryModel categoryModel;

}
