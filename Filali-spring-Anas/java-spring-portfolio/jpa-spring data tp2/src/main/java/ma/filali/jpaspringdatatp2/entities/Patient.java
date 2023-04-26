package ma.filali.jpaspringdatatp2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock
//        3. Créer l'entité JPA Patient ayant les attributs :
//        - id de type Long
//        - nom de type String
//        - dateNaissanec de type Date
//        - malade de type boolean
//        - score de type int
@Entity
@Data  @NoArgsConstructor @AllArgsConstructor

public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(name = "Nom", length =  40)
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissace;
    private boolean choix;
    private int score;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
