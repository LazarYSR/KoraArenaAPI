package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.TerrainDaoImpl;
import ma.ehei.Prj_KoraArenaAPI.Dto.TerrainDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TerrainDtoMapper {
    public Terrain ToTerrain(TerrainDto terrainDto)
    {
        Terrain terrain =new Terrain();
        BeanUtils.copyProperties(terrainDto,terrain);
        return terrain;
    }
    public TerrainDto ToTerrainDto(Terrain terrain)
    {
        TerrainDto terrainDto =new TerrainDto();
        BeanUtils.copyProperties(terrain,terrainDto);
        return terrainDto;
    }
}
