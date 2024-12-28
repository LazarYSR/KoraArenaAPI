package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.SecteurDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.SecteurDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;
import ma.ehei.Prj_KoraArenaAPI.Service.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SecteurServiceImpl implements SecteurService {


    private SecteurDao secteurDao;
    private SecteurDtoMapper secteurDtoMapper;

    @Override
    public SecteurDto addSecteur(SecteurDto secteurDto) {
        Secteur secteur = secteurDtoMapper.ToSecteur(secteurDto);
        Secteur addedSecteur = secteurDao.ajouterSecteur(secteur);
        return secteurDtoMapper.ToSecteurDto(addedSecteur);
    }

    @Override
    public List<SecteurDto> getAllSecteurs() {
        List<Secteur> secteurs = secteurDao.listerSecteurs();
        return secteurs.stream()
                .map(secteurDtoMapper::ToSecteurDto)
                .collect(Collectors.toList());
    }

    @Override
    public SecteurDto getSecteurByNom(String nomSecteur) {
        Secteur secteur = secteurDao.trouverSecteurParNom(nomSecteur);
        return secteurDtoMapper.ToSecteurDto(secteur);
    }

    @Override
    public SecteurDto updateSecteur(SecteurDto secteurDto) {
        Secteur secteur = secteurDtoMapper.ToSecteur(secteurDto);
        Secteur updatedSecteur = secteurDao.modifierSecteur(secteur);
        return secteurDtoMapper.ToSecteurDto(updatedSecteur);
    }

    @Override
    public void deleteSecteur(String nomSecteur) {
        secteurDao.supprimerSecteur(nomSecteur);
    }



}
