package ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories;

import ma.ehei.Prj_KoraArenaAPI.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
<<<<<<< Updated upstream
=======
    User findByCin (String cin);
    User findByLoginAndPassword (String login,String password);

>>>>>>> Stashed changes
}
