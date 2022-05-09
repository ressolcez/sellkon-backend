package intj.frontend.sellkon.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "LaptopDetails")
public class LaptopDetailsModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long LaptopDetails_id;

    @Column(name = "procesor")
    private String processor;

    @Column(name = "Chipset")
    private String chipset;

    @Column(name = "RAM")
    private String RAM;

    @Column(name = "Karta_Graficzna")
    private String grapic_card;

    @Column(name = "Wielkosc_pam_grafiki")
    private String grapic_card_max_mem;

    @Column(name = "Dzwiek")
    private String sound;

    @Column(name = "Napedy_optyczne")
    private String optical_drives;

    @Column(name = "Lacznosc")
    private String connection;

    @Column(name = "Zasilacz")
    private String charger;

    @Column(name = "System_operacyjny")
    private String operating_system;

    @Column(name = "Szerokosc")
    private String width;

    @Column(name = "Wyokosc")
    private String height;

    @Column(name = "Glebokosc")
    private String depth;

    @Column(name = "typ_ekranu")
    private String ekran_type;

    @Column(name = "przekatna_ekranu")
    private String screen_diag;

    @Column(name = "rozdzielczosc_ekranu")
    private String ekran_res;

    @Column(name = "jasność_matrycy")
    private String matrix_britn;

}
