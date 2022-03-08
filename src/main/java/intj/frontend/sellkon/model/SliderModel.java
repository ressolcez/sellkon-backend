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
@Table(name = "SliderRes")
public class SliderModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "obrazek")
    @Lob
    private String img;

    @Column(name = "tytul")
    private String title;

    @Column(name = "opis")
    private String desc;

    @Column(name = "tlo")
    private String bg;
}
