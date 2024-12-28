package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.ResponsableRepository;

import ma.ehei.Prj_KoraArenaAPI.Dto.ResponsableDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.ResponsableDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.Responsable;
import ma.ehei.Prj_KoraArenaAPI.Service.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ResponsableServiceImpl implements ResponsableService {


    private ResponsableRepository responsableRepository;
    private ResponsableDtoMapper responsableDtoMapper ;

    @Override
    public ResponsableDto addResponsable(ResponsableDto responsableDto) {
        Responsable responsable = responsableDtoMapper.ToResponsable(responsableDto);
        Responsable savedResponsable = responsableRepository.save(responsable);
        return responsableDtoMapper.ToResponsableDto(savedResponsable);
    }

    @Override
    public List<ResponsableDto> getAllResponsables() {
        List<Responsable> responsables = responsableRepository.findAll();
        return responsables.stream()
                .map(responsableDtoMapper::ToResponsableDto)
                .collect(Collectors.toList());
    }

    @Override
    public ResponsableDto getResponsableById(String id) {
        Responsable responsable = responsableRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Responsable not found with id: " + id));
        return responsableDtoMapper.ToResponsableDto(responsable);
    }

    @Override
    public ResponsableDto updateResponsable(ResponsableDto responsableDto) {
        Responsable responsable = responsableDtoMapper.ToResponsable(responsableDto);
        Responsable updatedResponsable = responsableRepository.save(responsable);
        return responsableDtoMapper.ToResponsableDto(updatedResponsable);
    }

    @Override
    public void deleteResponsable(String id) {
        if (!responsableRepository.existsById(id)) {
            throw new RuntimeException("Responsable not found with id: " + id);
        }
        responsableRepository.deleteById(id);
    }
}
