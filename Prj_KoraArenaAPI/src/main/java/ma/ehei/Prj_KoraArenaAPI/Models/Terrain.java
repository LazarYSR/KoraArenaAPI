package ma.ehei.Prj_KoraArenaAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Collections;

@Entity@Data
@AllArgsConstructor @NoArgsConstructor
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double longitude;
    private double latitude;
    private boolean disponibilite;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "secteurid", referencedColumnName = "nomSecteur")
    private Secteur secteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsable_id")
    private Responsable responsable;

    @OneToMany(mappedBy ="terrain" ,fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Reservation> reservations;
}
