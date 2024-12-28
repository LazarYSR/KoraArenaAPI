package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationDao {
    Reservation ajouterReservation(Reservation reservation);
    List<Reservation> listerReservations();
    Reservation trouverReservationParId(String id);
    Reservation modifierReservation(Reservation reservation);
    void supprimerReservation(String id);

    List<Reservation> findByDateReservation(Date dateReservation);
    List<Reservation> findByUserId(String userId);
    List<Reservation> findByTerrainId(Long terrainId);
    List<Reservation> findByStatusReservation(String status);
}
