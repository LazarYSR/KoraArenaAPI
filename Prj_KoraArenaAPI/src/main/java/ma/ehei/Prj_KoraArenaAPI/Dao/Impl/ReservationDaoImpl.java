package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.FactureRepository;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.ReservationRepository;
import ma.ehei.Prj_KoraArenaAPI.Dao.ReservationDao;
import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ReservationDaoImpl implements ReservationDao {


    private ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {

        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> listerReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation trouverReservationParId(String id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerReservation(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> findByDateReservation(Date dateReservation) {
        return reservationRepository.findByDateReservation(dateReservation);
    }

    @Override
    public List<Reservation> findByUserId(String userId) {
        return reservationRepository.findByUserId(userId);
    }

    @Override
    public List<Reservation> findByTerrainId(Long terrainId) {
        return reservationRepository.findByTerrainId(terrainId);
    }

    @Override
    public List<Reservation> findByStatusReservation(String status) {
        return reservationRepository.findByStatusReservation(status);
    }
}
