package ma.ehei.Prj_KoraArenaAPI.Controller;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Dto.TerrainDto;
import ma.ehei.Prj_KoraArenaAPI.Service.SecteurService;
import ma.ehei.Prj_KoraArenaAPI.Service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terrains")
@CrossOrigin("*")

public class TerrainController {
@Autowired
    private TerrainService terrainService;
    @Autowired
    private SecteurService secteurService;
    @GetMapping("get-terrain/{ville}/{secteur}")
    public List<TerrainDto> GetAllTerrainsByVilleAndSecteur(@PathVariable("ville")String ville,@PathVariable("secteur")String secteur)
    {
        return terrainService.ChercherTerrainsParVilleEtSecteur(ville,secteur);
    }
    @GetMapping("get-secteurs/{ville}")
    List<SecteurDto> TousSectorsParVille(@PathVariable("ville")String Ville)
    {
        return secteurService.findSecteursByVille(Ville);
    }
}
