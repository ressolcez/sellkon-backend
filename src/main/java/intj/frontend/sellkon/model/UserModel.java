package intj.frontend.sellkon.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Uzytkownicy")
public class UserModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long user_id;

    @Column(name="login")
    private String username;

    @Column(name="haslo")
    private String password;

    @Column(name="imie")
    private String name;

}
