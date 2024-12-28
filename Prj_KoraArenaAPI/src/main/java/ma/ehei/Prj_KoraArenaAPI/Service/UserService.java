package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto AjouterUser(UserDto userDto);

    UserDto UserInfo(String cin);

    UserDto Authentification(String login, String password);

    List<UserDto> getAllUsers();

    void updateUser(UserDto userDto);

    void deleteUser(String s);

    List<UserDto> findUsersByActivityStatus(boolean active);
}
