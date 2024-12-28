package ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories;

import ma.ehei.Prj_KoraArenaAPI.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Long> {
    List<Notification> findByUserId(Long userId);
}
