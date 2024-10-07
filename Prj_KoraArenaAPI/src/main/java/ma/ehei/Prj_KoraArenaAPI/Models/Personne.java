package ma.ehei.Prj_KoraArenaAPI.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Personne {
    @Id
    private String cin;
    @Column(length = 15)
    private String nom;
    @Column(length = 15)
    private String prenom;
    @Column(unique = true)
    private String login;
    private String password;
    private String email;
    @Column(length = 11)
    private Long telephone;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    private String photo;

}
