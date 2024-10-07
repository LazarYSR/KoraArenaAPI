package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.AdminDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.AdminRepository;
import ma.ehei.Prj_KoraArenaAPI.Models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminDaoImpl implements AdminDao {
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public Admin AjouterAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
