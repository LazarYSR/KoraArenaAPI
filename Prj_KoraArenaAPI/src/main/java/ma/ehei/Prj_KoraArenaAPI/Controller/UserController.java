package ma.ehei.Prj_KoraArenaAPI.Controller;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        UserDto savedUser = userService.AjouterUser(userDto);
        return ResponseEntity.ok(savedUser);
    }


    @GetMapping("/{cin}")
    public ResponseEntity<UserDto> getUserInfo(@PathVariable String cin) {
        UserDto userDto = userService.UserInfo(cin);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/auth")
    public ResponseEntity<UserDto> authenticateUser(
            @RequestParam String login,
            @RequestParam String password) {
        UserDto userDto = userService.Authentification(login, password);
        return ResponseEntity.ok(userDto);
    }


    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }


    @PutMapping("/{cin}")
    public ResponseEntity<Void> updateUser(@PathVariable String cin, @RequestBody UserDto userDto) {
        userDto.setCin(cin);
        userService.updateUser(userDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{cin}")
    public ResponseEntity<Void> deleteUser(@PathVariable String cin) {
        userService.deleteUser(cin);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/active/{status}")
    public ResponseEntity<List<UserDto>> getUsersByActivityStatus(@PathVariable boolean status) {
        List<UserDto> users = userService.findUsersByActivityStatus(status);
        return ResponseEntity.ok(users);
    }
}
