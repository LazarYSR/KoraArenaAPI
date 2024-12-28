package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;

import java.util.List;

public interface SecteurDao {
    Secteur ajouterSecteur(Secteur secteur);
    List<Secteur> listerSecteurs();
    Secteur trouverSecteurParNom(String nomSecteur);
    Secteur modifierSecteur(Secteur secteur);
    void supprimerSecteur(String nomSecteur);
}
