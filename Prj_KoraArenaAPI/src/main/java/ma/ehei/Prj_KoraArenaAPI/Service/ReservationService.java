package ma.ehei.Prj_KoraArenaAPI.Services;

import ma.ehei.Prj_KoraArenaAPI.Dto.ReservationDto;

import java.util.Date;
import java.util.List;

public interface ReservationService {
    ReservationDto ajouterReservation(ReservationDto reservationDto);
    List<ReservationDto> listerReservations();
    ReservationDto trouverReservationParId(String id);
    ReservationDto modifierReservation(ReservationDto reservationDto);
    void supprimerReservation(String id);

    List<ReservationDto> findByDateReservation(Date dateReservation);
    List<ReservationDto> findByUserId(String userId);
    List<ReservationDto> findByTerrainId(Long terrainId);
    List<ReservationDto> findByStatusReservation(String status);
}
