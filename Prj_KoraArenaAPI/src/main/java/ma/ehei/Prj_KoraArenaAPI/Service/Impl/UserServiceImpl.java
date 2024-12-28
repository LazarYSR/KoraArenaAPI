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
    private final UserDtoMapper userDtoMapper;

    @Override
    public UserDto AjouterUser(UserDto userDto) {
        User user = userDtoMapper.ToUser(userDto);
        User savedUser = userDao.AjouterUser(user);
        return userDtoMapper.ToUserDto(savedUser);
    }

    @Override
    public UserDto UserInfo(String cin) {
        User user = userDao.GetUserInfo(cin);
        return userDtoMapper.ToUserDto(user);
    }

    @Override
    public UserDto Authentification(String login, String password) {
        User user = userDao.Authentification(login, password);
        return userDtoMapper.ToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userDao.getAllUsers();
        return users.stream()
                .map(userDtoMapper::ToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public void updateUser(UserDto userDto) {
        User user = userDtoMapper.ToUser(userDto);
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(String cin) {
        userDao.deleteUser(cin);
    }

    @Override
    public List<UserDto> findUsersByActivityStatus(boolean active) {
        List<User> users = userDao.findUsersByActivityStatus(active);
        return users.stream()
                .map(userDtoMapper::ToUserDto)
                .collect(Collectors.toList());
    }
}
