package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.TerrainDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.TerrainDto;
import ma.ehei.Prj_KoraArenaAPI.Dto.UserDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.TerrainDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;
import ma.ehei.Prj_KoraArenaAPI.Service.TerrainService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TerrainServiceImpl implements TerrainService {
    private final TerrainDao terrainDao;
    private final TerrainDtoMapper terrainDtoMapper;
    @Override
    public List<TerrainDto> ChercherTerrainsParVilleEtSecteur(String ville, String secteur) {
        List<Terrain> Terrains =terrainDao.SearchTerrainCityandSecteur(ville,secteur);
        List<TerrainDto> TerrainsDtos= Terrains.stream().map(tr->terrainDtoMapper.ToTerrainDto(tr)).collect(Collectors.toList());
        return TerrainsDtos;
    }


//    @Override
//    public List<UserDto> FindAllUsers() {
//        List<User> Users = userDao.findAllUsers();
//        List<UserDto> ListUsers= Users.stream().map(us-> userMapper
//                        .ToUserDto(us))
//                .collect(Collectors.toList());
//
//        return ListUsers;
//    }
}
