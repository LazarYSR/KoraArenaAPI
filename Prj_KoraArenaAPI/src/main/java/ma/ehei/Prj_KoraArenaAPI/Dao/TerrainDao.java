package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;

import java.util.List;

public interface TerrainDao {
    public List<Terrain> SearchTerrainCityandSecteur(String city, String secteur);
}
