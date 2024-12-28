package ma.ehei.Prj_KoraArenaAPI.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDto {
    private Long id;
    private String message;
    private Date envoyerA;
    private String userId;
    private String invitationId;
}
