package ma.ehei.Prj_KoraArenaAPI.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Models.StatusReservation;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
    private String id;
    private Date dateReservation;
    private Date heureReservation;
    private Date heureDebut;
    private Date heureFin;
    private StatusReservation statusReservation;
    private double montant;
    private Long terrainId;
    private String userId;
}
