package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.TerrainDto;

import ma.ehei.Prj_KoraArenaAPI.Service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terrains")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;


    @PostMapping
    public ResponseEntity<TerrainDto> ajouterTerrain(@RequestBody TerrainDto terrainDto) {
        TerrainDto savedTerrain = terrainService.ajouterTerrain(terrainDto);
        return ResponseEntity.ok(savedTerrain);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TerrainDto> modifierTerrain(@PathVariable Long id, @RequestBody TerrainDto terrainDto) {
        terrainDto.setId(id);
        TerrainDto updatedTerrain = terrainService.modifierTerrain(terrainDto);
        return ResponseEntity.ok(updatedTerrain);
    }


    @GetMapping("/{id}")
    public ResponseEntity<TerrainDto> trouverTerrainParId(@PathVariable String id) {
        TerrainDto terrain = terrainService.trouverTerrainParId(id);
        return ResponseEntity.ok(terrain);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerTerrain(@PathVariable Long id) {
        terrainService.supprimerTerrain(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping
    public ResponseEntity<List<TerrainDto>> listerTerrains() {
        List<TerrainDto> terrains = terrainService.listerTerrains();
        return ResponseEntity.ok(terrains);
    }


    @GetMapping("/disponibilite/{status}")
    public ResponseEntity<List<TerrainDto>> findByDisponibilite(@PathVariable boolean status) {
        List<TerrainDto> terrains = terrainService.findByDisponibilite(status);
        return ResponseEntity.ok(terrains);
    }


    @GetMapping("/secteur/{secteurNom}")
    public ResponseEntity<List<TerrainDto>> findBySecteurNom(@PathVariable String secteurNom) {
        List<TerrainDto> terrains = terrainService.findBySecteurNom(secteurNom);
        return ResponseEntity.ok(terrains);
    }


    @GetMapping("/responsable/{responsableId}")
    public ResponseEntity<List<TerrainDto>> findByResponsableId(@PathVariable String responsableId) {
        List<TerrainDto> terrains = terrainService.findByResponsableId(responsableId);
        return ResponseEntity.ok(terrains);
    }


    @GetMapping("/search")
    public ResponseEntity<List<TerrainDto>> SearchTerrainCityandSecteur(
            @RequestParam String city, @RequestParam String secteur) {
        List<TerrainDto> terrains = terrainService.SearchTerrainCityandSecteur(city, secteur);
        return ResponseEntity.ok(terrains);
    }
}
