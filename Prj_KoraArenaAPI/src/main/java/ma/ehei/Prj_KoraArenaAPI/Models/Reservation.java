package ma.ehei.Prj_KoraArenaAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    private String id;
    @Temporal(TemporalType.DATE)
    private Date dateReservation;
    @Temporal(TemporalType.TIME)
    private Date heureReservation;
    @Temporal(TemporalType.TIME)
    private Date heureDebut;
    @Temporal(TemporalType.TIME)
    private Date heureFin;
    private StatusReservation statusReservation;
    private double montant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reservateurid")
    private User user;

    @OneToMany(mappedBy = "reservation",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Invitation> invitations;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "terrainid")
    private Terrain terrain;

    @OneToMany(mappedBy = "reservation",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Facture> factures;
}
