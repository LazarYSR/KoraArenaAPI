package ma.ehei.Prj_KoraArenaAPI.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {
    private String cin;

    private String nom;

    private String prenom;

    private String login;
    private String password;
    private String email;

    private Long telephone;

    private Date createdAt;
    private String photo;
}
