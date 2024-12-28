package ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories;

import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {


    List<Reservation> findByDateReservation(Date dateReservation);


    List<Reservation> findByUserId(String userId);

    List<Reservation> findByTerrainId(Long terrainId);

    List<Reservation> findByStatusReservation(String status);
}
