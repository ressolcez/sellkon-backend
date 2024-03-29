package intj.frontend.sellkon.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Opinie")
public class OpinionsModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Opinie_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserModel userModel;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductModel productModel;

    @Column(name = "komentarz")
    @Lob
    private String comment;

    @Column(name = "ocena")
    private Double rating;

}
