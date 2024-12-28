package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.ReservationDto;
import ma.ehei.Prj_KoraArenaAPI.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public ResponseEntity<ReservationDto> ajouterReservation(@RequestBody ReservationDto reservationDto) {
        return ResponseEntity.ok(reservationService.ajouterReservation(reservationDto));
    }

    @GetMapping
    public ResponseEntity<List<ReservationDto>> listerReservations() {
        return ResponseEntity.ok(reservationService.listerReservations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationDto> trouverReservationParId(@PathVariable String id) {
        return ResponseEntity.ok(reservationService.trouverReservationParId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservationDto> modifierReservation(
            @PathVariable String id, @RequestBody ReservationDto reservationDto) {
        reservationDto.setId(id);
        return ResponseEntity.ok(reservationService.modifierReservation(reservationDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerReservation(@PathVariable String id) {
        reservationService.supprimerReservation(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/date")
    public ResponseEntity<List<ReservationDto>> findByDateReservation(@RequestParam Date dateReservation) {
        return ResponseEntity.ok(reservationService.findByDateReservation(dateReservation));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ReservationDto>> findByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(reservationService.findByUserId(userId));
    }

    @GetMapping("/terrain/{terrainId}")
    public ResponseEntity<List<ReservationDto>> findByTerrainId(@PathVariable Long terrainId) {
        return ResponseEntity.ok(reservationService.findByTerrainId(terrainId));
    }
}
