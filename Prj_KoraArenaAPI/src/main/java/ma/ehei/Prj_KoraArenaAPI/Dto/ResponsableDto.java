package ma.ehei.Prj_KoraArenaAPI.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ResponsableDto {
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
