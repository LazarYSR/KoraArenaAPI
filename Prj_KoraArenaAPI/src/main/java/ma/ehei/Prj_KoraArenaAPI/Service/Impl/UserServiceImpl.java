package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.UserDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.UserDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import ma.ehei.Prj_KoraArenaAPI.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    @Override
    public UserDto UserInfo(String cin) {
        User us =userDao.GetUserInfo(cin);
        UserDto userDto= userDtoMapper.ToUserDto(us);
        return userDto;
    }

    @Override
    public UserDto Authentification(String login, String password) {
        User us =userDao.Authentification(login,password);
        UserDto userDto= userDtoMapper.ToUserDto(us);
        return userDto;
    }
}
