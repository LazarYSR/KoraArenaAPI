package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.AdminDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.AdminDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.AdminDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminDao adminDao;
    private final AdminDtoMapper adminDtoMapper;

    @Override
    public AdminDto addAdmin(AdminDto adminDto) {
        var admin = adminDtoMapper.ToAdmin(adminDto);
        adminDao.AjouterAdmin(admin);
        return adminDtoMapper.ToAdminDto(admin);
    }

    @Override
    public AdminDto getAdminInfo(String cin) {
        var admin = adminDao.GetAdminInfo(cin);
        return adminDtoMapper.ToAdminDto(admin);
    }

    @Override
    public AdminDto authenticateAdmin(String login, String password) {
        var admin = adminDao.AuthentificationAdmin(login, password);
        return adminDtoMapper.ToAdminDto(admin);
    }

    @Override
    public List<AdminDto> getAllAdmins() {
        return adminDao.GetAllAdmins().stream()
                .map(adminDtoMapper::ToAdminDto)
                .collect(Collectors.toList());
    }

    @Override
    public void updateAdmin(AdminDto adminDto) {
        var admin = adminDtoMapper.ToAdmin(adminDto);
        adminDao.UpdateAdmin(admin);
    }

    @Override
    public void deleteAdmin(String cin) {
        adminDao.DeleteAdmin(cin);
    }
}
