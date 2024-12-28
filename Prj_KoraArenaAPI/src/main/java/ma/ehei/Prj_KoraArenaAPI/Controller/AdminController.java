package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.AdminDto;
import ma.ehei.Prj_KoraArenaAPI.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/info/{cin}")
    public AdminDto getAdminInfo(@PathVariable String cin) {
        return adminService.getAdminInfo(cin);
    }

    @GetMapping("/auth")
    public AdminDto authenticateAdmin(@RequestParam String login, @RequestParam String password) {
        return adminService.authenticateAdmin(login, password);
    }

    // Get all Admins
    @GetMapping("/all")
    public List<AdminDto> getAllAdmins() {
        return adminService.getAllAdmins();
    }


    @PostMapping("/add")
    public AdminDto addAdmin(@RequestBody AdminDto adminDto) {
        return adminService.addAdmin(adminDto);
    }


    @PutMapping("/update")
    public void updateAdmin(@RequestBody AdminDto adminDto) {
        adminService.updateAdmin(adminDto);
    }


    @DeleteMapping("/delete/{cin}")
    public void deleteAdmin(@PathVariable String cin) {
        adminService.deleteAdmin(cin);
    }
}
