package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.TerrainRepository;
import ma.ehei.Prj_KoraArenaAPI.Dao.TerrainDao;
import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TerrainDaoImpl implements TerrainDao {

    @Autowired
    private TerrainRepository terrainRepository;

    @Override
    public List<Terrain> SearchTerrainCityandSecteur(String city, String secteur) {
        // Custom query implementation in TerrainRepository
        return terrainRepository.findByCityAndSecteur(city, secteur);
    }

    @Override
    public List<Terrain> findByDisponibilite(boolean disponibilite) {
        return terrainRepository.findByDisponibilite(disponibilite);
    }

    @Override
    public List<Terrain> findBySecteurNom(String secteurNom) {
        return terrainRepository.findBySecteurNomSecteur(secteurNom);
    }

    @Override
    public List<Terrain> findByResponsableId(String responsableId) {
        return terrainRepository.findTerrainByResponsable(responsableId);
    }

    @Override
    public Terrain ajouterTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }

    @Override
    public List<Terrain> listerTerrains() {
        return terrainRepository.findAll();
    }

    @Override
    public Terrain trouverTerrainParId(String id) {
        return terrainRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new RuntimeException("Terrain introuvable avec l'ID : " + id));
    }


    @Override
    public Terrain modifierTerrain(Terrain terrain) {
        if (!terrainRepository.existsById(terrain.getId())) {
            throw new RuntimeException("Terrain introuvable avec l'ID : " + terrain.getId());
        }
        return terrainRepository.save(terrain);
    }

    @Override
    public void supprimerTerrain(Long id) {
        if (!terrainRepository.existsById(id)) {
            throw new RuntimeException("Terrain introuvable avec l'ID : " + id);
        }
        terrainRepository.deleteById(id);
    }
}
