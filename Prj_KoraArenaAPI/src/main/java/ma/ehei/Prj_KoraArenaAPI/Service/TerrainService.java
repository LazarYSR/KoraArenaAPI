package ma.ehei.Prj_KoraArenaAPI.Service;
import ma.ehei.Prj_KoraArenaAPI.Dto.TerrainDto;

import java.util.List;

public interface TerrainService {

    TerrainDto ajouterTerrain(TerrainDto terrainDto);

    TerrainDto modifierTerrain(TerrainDto terrainDto);

    TerrainDto trouverTerrainParId(String id);

    void supprimerTerrain(Long id);

    List<TerrainDto> listerTerrains();

    List<TerrainDto> findByDisponibilite(boolean disponibilite);

    List<TerrainDto> findBySecteurNom(String secteurNom);

    List<TerrainDto> findByResponsableId(String responsableId);

    List<TerrainDto> SearchTerrainCityandSecteur(String city, String secteur);
}
