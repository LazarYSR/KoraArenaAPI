package ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories;

import ma.ehei.Prj_KoraArenaAPI.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // Find a user by CIN
    User findByCin(String cin);

    // Authenticate a user by login and password
    User findByLoginAndPassword(String login, String password);

    // Find users by their active status

    List<User> findByActive( boolean active);
}
