package ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories;

import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain,Long> {
    @Query("SELECT t FROM Terrain t WHERE t.secteur.city = :city AND t.secteur.nomSecteur = :secteur")
    List<Terrain> findByCityAndSecteur(@Param("city") String city, @Param("secteur") String secteur);    List<Terrain> findByDisponibilite(boolean disponibilite);
    List<Terrain> findBySecteurNomSecteur(String nom);
    List<Terrain> findTerrainByResponsable(String nom);

}
