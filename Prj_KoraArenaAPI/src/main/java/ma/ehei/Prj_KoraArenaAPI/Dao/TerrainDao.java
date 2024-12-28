package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;

import java.util.List;

public interface TerrainDao {
    public List<Terrain> SearchTerrainCityandSecteur(String city, String secteur);

    List<Terrain> findByDisponibilite(boolean disponibilite);


    List<Terrain> findBySecteurNom(String secteurNom);

    List<Terrain> findByResponsableId(String responsableId);
    Terrain ajouterTerrain(Terrain terrain);
    List<Terrain> listerTerrains();
    Terrain trouverTerrainParId(String id);
    Terrain modifierTerrain(Terrain terrain);
    void supprimerTerrain(Long id);

}
