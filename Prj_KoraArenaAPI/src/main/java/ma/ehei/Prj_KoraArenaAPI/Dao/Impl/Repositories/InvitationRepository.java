package ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories;

import ma.ehei.Prj_KoraArenaAPI.Models.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvitationRepository extends JpaRepository<Invitation, Long> {
    List<Invitation> findByReservationId(String reservationId);
    List<Invitation> findByUserRecepteurId(String userRecepteurId);
    List<Invitation> findByUserInviterId(String userInviterId);
}
