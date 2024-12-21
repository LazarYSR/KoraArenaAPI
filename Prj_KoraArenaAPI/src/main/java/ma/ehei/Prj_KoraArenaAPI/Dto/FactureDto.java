package ma.ehei.Prj_KoraArenaAPI.Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Models.Paiement;
import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;

import java.util.Date;
@Data
@NoArgsConstructor @AllArgsConstructor
public class FactureDto {

    private String id;
    private double montantTotal;

    private Paiement modePaiement;


    private Date datePaiement;


    private Reservation reservation;
}
