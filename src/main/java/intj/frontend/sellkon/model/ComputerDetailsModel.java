package intj.frontend.sellkon.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

@Table(name = "ComputerDetails")
public class ComputerDetailsModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long ComputerDetails_id;

    @Column(name = "producer")
    private String producer;

}


