package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.InvitationDto;

import java.util.List;

public interface InvitationService {
    InvitationDto addInvitation(InvitationDto invitationDto);
    List<InvitationDto> listInvitations();
    InvitationDto findInvitationById(Long id);
    List<InvitationDto> findByReservation(String reservationId);
    List<InvitationDto> findByUserRecepteur(String userRecepteurId);
    List<InvitationDto> findByUserInviter(String userInviterId);
    void deleteInvitation(Long id);
}
