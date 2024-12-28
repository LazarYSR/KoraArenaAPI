package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.ResponsableDto;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;

import java.util.List;

public interface ResponsableService {
    ResponsableDto addResponsable(ResponsableDto responsableDto);
    List<ResponsableDto> getAllResponsables();
    ResponsableDto getResponsableById(String id);
    ResponsableDto updateResponsable(ResponsableDto responsableDto);
    void deleteResponsable(String id);
}
