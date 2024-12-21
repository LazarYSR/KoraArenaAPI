package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.ResponsableDto;
import ma.ehei.Prj_KoraArenaAPI.Dto.SecteurDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Responsable;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SecteurDtoMapper {
    public SecteurDto ToSecteurDto(Secteur secteur)
    {
        SecteurDto secteurDto=new SecteurDto();
        BeanUtils.copyProperties(secteur, secteurDto);
        return secteurDto;
    }
    public Secteur ToSecteur(SecteurDto secteurDto)
    {
        Secteur secteur=new Secteur();
        BeanUtils.copyProperties(secteurDto,secteur);
        return secteur;
    }

}
