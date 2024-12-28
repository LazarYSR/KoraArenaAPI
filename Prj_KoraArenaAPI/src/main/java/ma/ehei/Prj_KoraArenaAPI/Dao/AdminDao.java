package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Admin;

import java.util.List;

public interface AdminDao {
    // Add a new admin
    Admin AjouterAdmin(Admin admin);

    // Get admin info by CIN
    Admin GetAdminInfo(String cin);

    // Authenticate admin by login and password
    Admin AuthentificationAdmin(String login, String password);

    // Get a list of all admins
    List<Admin> GetAllAdmins();

    // Update an existing admin
    void UpdateAdmin(Admin admin);

    // Delete an admin by CIN
    void DeleteAdmin(String cin);
}
