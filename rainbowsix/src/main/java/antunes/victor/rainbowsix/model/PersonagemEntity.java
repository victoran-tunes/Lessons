package antunes.victor.rainbowsix.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@AllArgsConstructor@NoArgsConstructor
@Getter@Setter@ToString


//JPA persistence API


@Entity
@Table(name="personagem")
public class PersonagemEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_personagem")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "armor")
    private int armor;

    @Column(name = "speed")
    private int speed;

    @Column(name = "skill")
    private String skill;
}

