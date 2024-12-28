package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Service.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secteurs")
public class SecteurController {

    @Autowired
    private SecteurService secteurService;


    @PostMapping("/add")
    public ResponseEntity<SecteurDto> addSecteur(@RequestBody SecteurDto secteurDto) {
        SecteurDto addedSecteur = secteurService.addSecteur(secteurDto);
        return new ResponseEntity<>(addedSecteur, HttpStatus.CREATED);
    }


    @GetMapping("/all")
    public ResponseEntity<List<SecteurDto>> getAllSecteurs() {
        List<SecteurDto> secteurs = secteurService.getAllSecteurs();
        return new ResponseEntity<>(secteurs, HttpStatus.OK);
    }


    @GetMapping("/{nomSecteur}")
    public ResponseEntity<SecteurDto> getSecteurByNom(@PathVariable String nomSecteur) {
        SecteurDto secteurDto = secteurService.getSecteurByNom(nomSecteur);
        return new ResponseEntity<>(secteurDto, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<SecteurDto> updateSecteur(@RequestBody SecteurDto secteurDto) {
        SecteurDto updatedSecteur = secteurService.updateSecteur(secteurDto);
        return new ResponseEntity<>(updatedSecteur, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{nomSecteur}")
    public ResponseEntity<Void> deleteSecteur(@PathVariable String nomSecteur) {
        secteurService.deleteSecteur(nomSecteur);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
