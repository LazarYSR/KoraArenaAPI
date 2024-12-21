package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

<<<<<<< Updated upstream
=======
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.SecteurRepository;
import ma.ehei.Prj_KoraArenaAPI.Dao.SecteurDao;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> Stashed changes
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
<<<<<<< Updated upstream
public class SecteurDaoImpl {
=======
public class SecteurDaoImpl implements SecteurDao {
    @Autowired
    private SecteurRepository secteurRepository;
    @Override
    public List<Secteur> finSecteursInCity(String ville) {
        return secteurRepository.findByCity_Nom(ville);
    }
>>>>>>> Stashed changes
}
