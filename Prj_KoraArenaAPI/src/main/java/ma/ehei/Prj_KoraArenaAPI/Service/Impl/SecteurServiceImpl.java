package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.SecteurDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.SecteurDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;
import ma.ehei.Prj_KoraArenaAPI.Service.SecteurService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SecteurServiceImpl implements SecteurService {
    private SecteurDao secteurDao;
    private SecteurDtoMapper secteurDtoMapper;
    @Override
    public List<SecteurDto> findSecteursByVille(String ville) {
        List<Secteur> Secteurs = secteurDao.finSecteursInCity(ville);
        List<SecteurDto> SectorDto = Secteurs.stream().map(sc-> secteurDtoMapper.ToSecteurDto(sc)).collect(Collectors.toList());
        return SectorDto;
    }
}
