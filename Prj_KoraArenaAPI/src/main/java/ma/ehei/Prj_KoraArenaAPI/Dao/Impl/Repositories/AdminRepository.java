package ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories;

import ma.ehei.Prj_KoraArenaAPI.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

    // Custom query methods
    Admin findByCin(String cin);
    Admin findByLoginAndPassword(String login, String password);

}
