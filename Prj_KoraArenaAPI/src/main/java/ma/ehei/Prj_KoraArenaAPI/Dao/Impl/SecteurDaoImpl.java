package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.SecteurDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.SecteurRepository;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SecteurDaoImpl implements SecteurDao {

    @Autowired
    private SecteurRepository secteurRepository;

    @Override
    public Secteur ajouterSecteur(Secteur secteur) {
        return secteurRepository.save(secteur);
    }

    @Override
    public List<Secteur> listerSecteurs() {
        return secteurRepository.findAll();
    }

    @Override
    public Secteur trouverSecteurParNom(String nomSecteur) {
        return secteurRepository.findById(nomSecteur)
                .orElseThrow(() -> new RuntimeException("Secteur introuvable avec le nom : " + nomSecteur));
    }

    @Override
    public Secteur modifierSecteur(Secteur secteur) {
        if (!secteurRepository.existsById(secteur.getNomSecteur())) {
            throw new RuntimeException("Secteur introuvable avec le nom : " + secteur.getNomSecteur());
        }
        return secteurRepository.save(secteur);
    }

    @Override
    public void supprimerSecteur(String nomSecteur) {
        if (!secteurRepository.existsById(nomSecteur)) {
            throw new RuntimeException("Secteur introuvable avec le nom : " + nomSecteur);
        }
        secteurRepository.deleteById(nomSecteur);
    }
}
