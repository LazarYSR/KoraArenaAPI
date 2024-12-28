package ma.ehei.Prj_KoraArenaAPI.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Models.StatusEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvitationDto {
    private Long id;
    private StatusEnum status;
    private Long reservationId;
    private Long notificationId;
    private String userInviterId;
    private String userRecepteurId;
}
