package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.NotificationDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Notification;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import ma.ehei.Prj_KoraArenaAPI.Models.Invitation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class NotificationDtoMapper {

    // Méthode pour convertir NotificationDto en Notification
    public Notification toNotification(NotificationDto notificationDto) {
        if (notificationDto == null) return null;

        Notification notification = new Notification();
        BeanUtils.copyProperties(notificationDto, notification);

        // Si userId est présent, créer un objet User et l'associer à la notification
        if (notificationDto.getUserId() != null) {
            User user = new User();
            user.setCin(notificationDto.getUserId()); // Ici, on suppose que userId est un CIN de type String
            notification.setUser(user);
        }

        // Si invitationId est présent, créer un objet Invitation et l'associer à la notification
        if (notificationDto.getInvitationId() != null) {
            Invitation invitation = new Invitation();
            invitation.setId(Long.valueOf(notificationDto.getInvitationId())); // invitationId doit être Long
            notification.setInvitation(invitation);
        }

        return notification;
    }

    // Méthode pour convertir Notification en NotificationDto
    public NotificationDto toNotificationDto(Notification notification) {
        if (notification == null) return null;

        NotificationDto notificationDto = new NotificationDto();
        BeanUtils.copyProperties(notification, notificationDto);

        if (notification.getUser() != null) {
            notificationDto.setUserId(notification.getUser().getCin());
        }


        if (notification.getInvitation() != null) {
            notificationDto.setInvitationId(String.valueOf(notification.getInvitation().getId()));
        }

        return notificationDto;
    }
}
