package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.AdminDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.AdminRepository;
import ma.ehei.Prj_KoraArenaAPI.Models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminDaoImpl implements AdminDao {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin AjouterAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin GetAdminInfo(String cin) {
        return adminRepository.findByCin(cin);
    }

    @Override
    public Admin AuthentificationAdmin(String login, String password) {
        return adminRepository.findByLoginAndPassword(login, password);
    }

    @Override
    public List<Admin> GetAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public void UpdateAdmin(Admin admin) {
        adminRepository.save(admin); // Save overwrites if the entity already exists
    }

    @Override
    public void DeleteAdmin(String cin) {
        adminRepository.deleteById(cin);
    }
}
