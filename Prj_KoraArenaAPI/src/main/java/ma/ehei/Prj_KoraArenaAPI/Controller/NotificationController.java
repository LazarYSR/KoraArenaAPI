package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.NotificationDto;
import ma.ehei.Prj_KoraArenaAPI.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;


    @GetMapping
    public ResponseEntity<List<NotificationDto>> getAllNotifications() {
        List<NotificationDto> notifications = notificationService.getAllNotifications();
        return ResponseEntity.ok(notifications);
    }

    // Endpoint pour récupérer une notification par ID
    @GetMapping("/{id}")
    public ResponseEntity<NotificationDto> getNotificationById(@PathVariable Long id) {
        NotificationDto notificationDto = notificationService.getNotificationById(id);
        if (notificationDto != null) {
            return ResponseEntity.ok(notificationDto);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }


    @PostMapping
    public ResponseEntity<NotificationDto> createNotification(@RequestBody NotificationDto notificationDto) {
        NotificationDto createdNotification = notificationService.createNotification(notificationDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdNotification);
    }

    // Endpoint pour mettre à jour une notification existante
    @PutMapping("/{id}")
    public ResponseEntity<NotificationDto> updateNotification(@PathVariable Long id, @RequestBody NotificationDto notificationDto) {
        NotificationDto updatedNotification = notificationService.updateNotification(id, notificationDto);
        if (updatedNotification != null) {
            return ResponseEntity.ok(updatedNotification);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Si la notification n'existe pas
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
        return ResponseEntity.noContent().build(); // Réponse sans contenu
    }
}
