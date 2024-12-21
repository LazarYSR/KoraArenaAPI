package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.UserRepository;
import ma.ehei.Prj_KoraArenaAPI.Dao.UserDao;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User AjouterUser(User user) {

        return userRepository.save(user);
    }
<<<<<<< Updated upstream
=======

    @Override
    public User GetUserInfo(String cin) {
        return userRepository.findByCin(cin);
    }

    @Override
    public User Authentification(String login, String password) {
        return userRepository.findByLoginAndPassword(login,password);
    }


>>>>>>> Stashed changes
}
