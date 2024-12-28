package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;

import java.util.List;

public interface SecteurService {
    SecteurDto addSecteur(SecteurDto secteurDto);
    List<SecteurDto> getAllSecteurs();
    SecteurDto getSecteurByNom(String nomSecteur);
    SecteurDto updateSecteur(SecteurDto secteurDto);
    void deleteSecteur(String nomSecteur);
}
