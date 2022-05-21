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
    private Long id;

    @Column(name = "ProductName")
    @Lob
    private String productName;

    @Column(name = "ShortName")
    private String shortName;

    @Column(name = "Price")
    private double price;

    @Column(name = "Slider")
    private Boolean slider;

    @Column(name = "SpecialOffer")
    private Boolean specialOffer;

    @Column(name = "NewPrice")
    private double newPrice;

    @Column(name = "ShortDesc")
    private String shortDesc;

    @Column(name = "FullDescription")
    @Lob
    private String fullDescription;

    @Column(name = "Image")
    @Lob
    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel categoryModel;

    @OneToOne
    @JoinColumn(name = "ComputerDetails_id")
    private ComputerDetailsModel computerDetailsModel;

    @OneToOne
    @JoinColumn(name = "LaptopDetails_id")
    private LaptopDetailsModel laptopDetailsModel;

}