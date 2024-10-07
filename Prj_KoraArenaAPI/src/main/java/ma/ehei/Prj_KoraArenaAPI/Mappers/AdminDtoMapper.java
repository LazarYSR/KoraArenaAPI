package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.AdminDto;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Admin;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AdminDtoMapper {

    public AdminDto ToAdminDto(Admin admin)
    {
        AdminDto adminDto =new AdminDto();
        BeanUtils.copyProperties(admin,adminDto);
        return adminDto;

    }
    public Admin ToAdmin(AdminDto adminDto)
    {
        Admin admin =new Admin();
        BeanUtils.copyProperties(adminDto,admin);
        return admin;

    }
}
