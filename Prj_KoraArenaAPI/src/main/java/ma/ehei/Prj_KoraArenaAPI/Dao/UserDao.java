package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.User;

import java.util.List;

public interface UserDao {
    User AjouterUser(User user);

    User GetUserInfo(String cin);
    User Authentification(String login,String password);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(String id);
    List<User> findUsersByActivityStatus(boolean active);




}
