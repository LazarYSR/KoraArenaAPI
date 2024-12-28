package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.ResponsableDto;
import ma.ehei.Prj_KoraArenaAPI.Service.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/responsable")
public class ResponsableController {

    @Autowired
    private ResponsableService responsableService;


    @PostMapping("/add")
    public ResponseEntity<ResponsableDto> addResponsable(@RequestBody ResponsableDto responsableDto) {
        ResponsableDto addedResponsable = responsableService.addResponsable(responsableDto);
        return new ResponseEntity<>(addedResponsable, HttpStatus.CREATED);
    }


    @GetMapping("/api/responsables")
    public ResponseEntity<List<ResponsableDto>> getAllResponsables() {
        List<ResponsableDto> responsables = responsableService.getAllResponsables();
        return new ResponseEntity<>(responsables, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsableDto> getResponsableById(@PathVariable String id) {
        ResponsableDto responsable = responsableService.getResponsableById(id);
        return new ResponseEntity<>(responsable, HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<ResponsableDto> updateResponsable(@RequestBody ResponsableDto responsableDto) {
        ResponsableDto updatedResponsable = responsableService.updateResponsable(responsableDto);
        return new ResponseEntity<>(updatedResponsable, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteResponsable(@PathVariable String id) {
        responsableService.deleteResponsable(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
