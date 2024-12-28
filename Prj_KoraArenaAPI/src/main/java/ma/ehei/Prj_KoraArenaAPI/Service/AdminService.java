package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.AdminDto;

import java.util.List;

public interface AdminService {
    AdminDto addAdmin(AdminDto adminDto);
    AdminDto getAdminInfo(String cin);
    AdminDto authenticateAdmin(String login, String password);
    List<AdminDto> getAllAdmins();
    void updateAdmin(AdminDto adminDto);
    void deleteAdmin(String cin);
}
