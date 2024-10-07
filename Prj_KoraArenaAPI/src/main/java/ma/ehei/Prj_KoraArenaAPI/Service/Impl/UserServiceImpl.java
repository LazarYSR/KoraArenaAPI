package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.UserDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.UserDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import ma.ehei.Prj_KoraArenaAPI.Service.UserService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final UserDtoMapper userDtoMapper ;
    @Override
    public UserDto AjouterUser(UserDto userDto) {
        User user = userDtoMapper.ToUser(userDto);
        userDao.AjouterUser(user);
        UserDto us1 = userDtoMapper.ToUserDto(user);
        return us1;
    }
}
