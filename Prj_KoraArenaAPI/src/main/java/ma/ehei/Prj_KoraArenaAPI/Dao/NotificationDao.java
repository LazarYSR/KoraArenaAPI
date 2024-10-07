package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Admin;
import ma.ehei.Prj_KoraArenaAPI.Models.User;

public interface NotificationDao {
    User EnvoyerNotification(User userEnvoyeur,User userRecepteur);
}
