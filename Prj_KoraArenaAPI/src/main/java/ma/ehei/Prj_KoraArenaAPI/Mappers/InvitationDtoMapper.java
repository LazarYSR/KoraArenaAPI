package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.InvitationDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Invitation;
import ma.ehei.Prj_KoraArenaAPI.Models.Notification;
import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class InvitationDtoMapper {

    public Invitation toInvitation(InvitationDto invitationDto) {
        if (invitationDto == null) return null;

        Invitation invitation = new Invitation();
        BeanUtils.copyProperties(invitationDto, invitation);

        // Manually set relationships based on IDs
        if (invitationDto.getReservationId() != null) {
            var reservation = new Reservation();
            reservation.setId(String.valueOf(invitationDto.getReservationId()));
            invitation.setReservation(reservation);
        }

        if (invitationDto.getNotificationId() != null) {
            var notification = new Notification();
            notification.setId(invitationDto.getNotificationId());
            invitation.setNotification(notification);
        }

        if (invitationDto.getUserInviterId() != null) {
            var userInviter = new User();
            userInviter.setCin(invitationDto.getUserInviterId()); // Utilise le CIN
            invitation.setUserInviter(userInviter);
        }

        if (invitationDto.getUserRecepteurId() != null) {
            var userRecepteur = new User();
            userRecepteur.setCin(invitationDto.getUserRecepteurId()); // Utilise le CIN
            invitation.setUserRecepteur(userRecepteur);
        }

        return invitation;
    }
    public InvitationDto toInvitationDto(Invitation invitation) {
        if (invitation == null) return null;

        InvitationDto invitationDto = new InvitationDto();
        BeanUtils.copyProperties(invitation, invitationDto);

        // Manually map IDs for relationships
        if (invitation.getReservation() != null) {
            invitationDto.setReservationId(Long.valueOf(invitation.getReservation().getId()));
        }


        if (invitation.getNotification() != null) {
            invitationDto.setNotificationId(invitation.getNotification().getId());
        }

        if (invitation.getUserInviter() != null) {
            invitationDto.setUserInviterId(invitation.getUserInviter().getCin());
        }

        if (invitation.getUserRecepteur() != null) {
            invitationDto.setUserRecepteurId(invitation.getUserRecepteur().getCin()); // Utilise le CIN
        }

        return invitationDto;
    }
}
