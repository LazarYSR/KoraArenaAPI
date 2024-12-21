package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

<<<<<<< Updated upstream
=======
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.TerrainRepository;
import ma.ehei.Prj_KoraArenaAPI.Dao.TerrainDao;
import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> Stashed changes
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
<<<<<<< Updated upstream
public class TerrainDaoImpl {
=======
public class TerrainDaoImpl implements TerrainDao {
    @Autowired
    private TerrainRepository terrainRepository;

    @Override
    public List<Terrain> SearchTerrainCityandSecteur(String city, String secteur) {
        return terrainRepository.findTerrainsByCityAndSector(city, secteur);
    }

>>>>>>> Stashed changes
}
