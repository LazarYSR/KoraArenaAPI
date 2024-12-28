package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationDao {

    List<Notification> getAllNotifications();

    Optional<Notification> getNotificationById(Long id);

    Notification saveNotification(Notification notification);

    void deleteNotification(Long id);
}
