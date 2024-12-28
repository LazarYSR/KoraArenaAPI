package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.InvitationDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.InvitationRepository;
import ma.ehei.Prj_KoraArenaAPI.Models.Invitation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class InvitationDaoImpl implements InvitationDao {

    private final InvitationRepository invitationRepository;

    @Override
    public Invitation addInvitation(Invitation invitation) {
        return invitationRepository.save(invitation);
    }

    @Override
    public List<Invitation> listInvitations() {
        return invitationRepository.findAll();
    }

    @Override
    public Invitation findInvitationById(Long id) {
        return invitationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Invitation> findByReservation(String reservationId) {
        return invitationRepository.findByReservationId(reservationId);
    }

    @Override
    public List<Invitation> findByUserRecepteur(String userRecepteurId) {
        return invitationRepository.findByUserRecepteurId(userRecepteurId);
    }

    @Override
    public List<Invitation> findByUserInviter(String userInviterId) {
        return invitationRepository.findByUserInviterId(userInviterId);
    }

    @Override
    public void deleteInvitation(Long id) {
        invitationRepository.deleteById(id);
    }
}
