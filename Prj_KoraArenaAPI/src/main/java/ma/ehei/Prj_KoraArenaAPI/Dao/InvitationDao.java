package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Invitation;

import java.util.List;

public interface InvitationDao {
    Invitation addInvitation(Invitation invitation);
    List<Invitation> listInvitations();
    Invitation findInvitationById(Long id);
    List<Invitation> findByReservation(String reservationId);
    List<Invitation> findByUserRecepteur(String userRecepteurId);
    List<Invitation> findByUserInviter(String userInviterId);
    void deleteInvitation(Long id);
}
