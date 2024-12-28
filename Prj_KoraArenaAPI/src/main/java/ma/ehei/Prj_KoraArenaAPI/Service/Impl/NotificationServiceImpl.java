package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.NotificationDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.NotificationDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.NotificationDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.Notification;
import ma.ehei.Prj_KoraArenaAPI.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationDao notificationDao;

    @Autowired
    private NotificationDtoMapper notificationDtoMapper;

    @Override
    public List<NotificationDto> getAllNotifications() {
        // Récupérer toutes les notifications, les convertir en NotificationDto et les retourner
        List<Notification> notifications = notificationDao.getAllNotifications();
        return notifications.stream()
                .map(notificationDtoMapper::toNotificationDto) // Conversion en NotificationDto
                .collect(Collectors.toList());
    }

    @Override
    public NotificationDto getNotificationById(Long id) {

        Optional<Notification> notification = notificationDao.getNotificationById(id);
        return notification.map(notificationDtoMapper::toNotificationDto).orElse(null); // Retourner null si non trouvé
    }

    @Override
    public NotificationDto createNotification(NotificationDto notificationDto) {
        // Convertir NotificationDto en Notification, puis sauvegarder
        Notification notification = notificationDtoMapper.toNotification(notificationDto);
        Notification savedNotification = notificationDao.saveNotification(notification);
        return notificationDtoMapper.toNotificationDto(savedNotification); // Retourner le NotificationDto sauvegardé
    }

    @Override
    public NotificationDto updateNotification(Long id, NotificationDto notificationDto) {
        if (notificationDao.getNotificationById(id)==null) {
            return null;
        }

        // Convertir NotificationDto en Notification, puis mettre à jour
        Notification notification = notificationDtoMapper.toNotification(notificationDto);
        notification.setId(id); // Assigner l'ID pour l'entité existante
        Notification updatedNotification = notificationDao.saveNotification(notification);
        return notificationDtoMapper.toNotificationDto(updatedNotification); // Retourner le NotificationDto mis à jour
    }

    @Override
    public void deleteNotification(Long id) {
        notificationDao.deleteNotification(id); // Supprimer la notification par ID
    }
}
