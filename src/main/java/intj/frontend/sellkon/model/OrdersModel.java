package intj.frontend.sellkon.model;

import javax.persistence.*;

public class OrdersModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Opinie_id;

    @Column(name="user_id")
    private UserModel userModel;

    @Column(name="product_id")
    private ProductModel productModel;

    @Column(name = "ocena")
    private Double rating;
}
