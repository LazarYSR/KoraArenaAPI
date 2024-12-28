package ma.ehei.Prj_KoraArenaAPI.Controller;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dto.InvitationDto;
import ma.ehei.Prj_KoraArenaAPI.Service.InvitationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invitations")
@AllArgsConstructor
public class InvitationController {

    private final InvitationService invitationService;

    @PostMapping
    public ResponseEntity<InvitationDto> addInvitation(@RequestBody InvitationDto invitationDto) {
        return ResponseEntity.ok(invitationService.addInvitation(invitationDto));
    }

    @GetMapping
    public ResponseEntity<List<InvitationDto>> listInvitations() {
        return ResponseEntity.ok(invitationService.listInvitations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvitationDto> findInvitationById(@PathVariable Long id) {
        return ResponseEntity.ok(invitationService.findInvitationById(id));
    }

    @GetMapping("/reservation/{reservationId}")
    public ResponseEntity<List<InvitationDto>> findByReservation(@PathVariable String reservationId) {
        return ResponseEntity.ok(invitationService.findByReservation(reservationId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvitation(@PathVariable Long id) {
        invitationService.deleteInvitation(id);
        return ResponseEntity.noContent().build();
    }
}
