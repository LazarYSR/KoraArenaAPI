package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.User;

public interface UserDao {
    User AjouterUser(User user);
<<<<<<< Updated upstream
=======
    User GetUserInfo(String cin);
    User Authentification(String login,String password);


>>>>>>> Stashed changes

}
