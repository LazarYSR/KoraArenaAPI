package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public UserDto ToUserDto(User user)
    {
        UserDto userDto=new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }
    public User ToUser(UserDto userDto)
    {
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        return user;
    }
}
