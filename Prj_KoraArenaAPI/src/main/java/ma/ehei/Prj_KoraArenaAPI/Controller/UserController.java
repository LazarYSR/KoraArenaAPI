package ma.ehei.Prj_KoraArenaAPI.Controller;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.UserDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import ma.ehei.Prj_KoraArenaAPI.Service.SecteurService;
import ma.ehei.Prj_KoraArenaAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")

public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("ajouter-user")
    UserDto Ajouter(@RequestBody UserDto userDto)
    {
        return userService.AjouterUser(userDto);
    }

    @GetMapping("get-user")
    UserDto RecupererInfoUser(String cin)
    {
        return userService.UserInfo(cin);
    }
    @GetMapping("auth-user/{log}/{pass}")
    UserDto AuthentificationUser(@PathVariable("log")String login,@PathVariable("pass")String password)
    {
        return userService.Authentification(login, password);
    }

}
