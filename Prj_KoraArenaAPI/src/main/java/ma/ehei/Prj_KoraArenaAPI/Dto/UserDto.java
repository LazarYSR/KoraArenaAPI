package ma.ehei.Prj_KoraArenaAPI.Dto;

import jakarta.websocket.OnOpen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String cin;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String email;
    private String telephone;
    private Date createdAt;
    private String photo;
    private boolean active;
    private Date dateNaissance;
}
