package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.ResponsableDto;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Responsable;
import ma.ehei.Prj_KoraArenaAPI.Models.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ResponsableDtoMapper {
    public ResponsableDto ToResponsableDto(Responsable responsable)
    {
        ResponsableDto responsableDto=new ResponsableDto();
        BeanUtils.copyProperties(responsable, responsableDto);
        return responsableDto;
    }
    public Responsable ToResponsable(ResponsableDto responsableDto)
    {
        Responsable responsable=new Responsable();
        BeanUtils.copyProperties(responsableDto,responsable);
        return responsable;
    }
}
