package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.UserRepository;
import ma.ehei.Prj_KoraArenaAPI.Dao.UserDao;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User AjouterUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User GetUserInfo(String cin) {
        return userRepository.findByCin(cin);
    }

    @Override
    public User Authentification(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public void updateUser(User user) {

        if (userRepository.existsById(user.getCin())) {
            userRepository.save(user);
        }
    }

    @Override
    public void deleteUser(String id) {

        if (userRepository.existsById(String.valueOf(id))) {
            userRepository.deleteById(String.valueOf(id));
        }
    }

    @Override
    public List<User> findUsersByActivityStatus(boolean active) {

        return userRepository.findByActive(active);
    }
}
