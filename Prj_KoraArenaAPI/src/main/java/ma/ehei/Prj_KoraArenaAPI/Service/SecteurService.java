package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;

import java.util.List;

public interface SecteurService {
    List<SecteurDto> findSecteursByVille(String ville);
}
