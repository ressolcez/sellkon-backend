package intj.frontend.sellkon.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Category")
public class CategoryModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long category_id;

    @Column(name = "CategoryName")
    private String cateGoryName;

    @Column(name = "Image")
    @Lob
    private String image;
}