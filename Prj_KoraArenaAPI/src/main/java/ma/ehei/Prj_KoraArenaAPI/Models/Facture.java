package ma.ehei.Prj_KoraArenaAPI.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
    @Id
    private String id;
    private double montantTotal;
    @Enumerated(EnumType.STRING)
    private Paiement modePaiement;

    @Temporal(TemporalType.TIMESTAMP)
    private Date datePaiement;

    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn(name = "reservationid")
    private Reservation reservation;



}
