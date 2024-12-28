package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.TerrainDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.TerrainDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.TerrainDtoMapper;

import ma.ehei.Prj_KoraArenaAPI.Service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class TerrainServiceImpl implements TerrainService {


    private final TerrainDao terrainDao;

    private final TerrainDtoMapper terrainDtoMapper;

    @Override
    public TerrainDto ajouterTerrain(TerrainDto terrainDto) {
        var terrain = terrainDtoMapper.ToTerrain(terrainDto);
        var savedTerrain = terrainDao.ajouterTerrain(terrain);
        return terrainDtoMapper.ToTerrainDto(savedTerrain);
    }

    @Override
    public TerrainDto modifierTerrain(TerrainDto terrainDto) {
        var terrain = terrainDtoMapper.ToTerrain(terrainDto);
        var updatedTerrain = terrainDao.modifierTerrain(terrain);
        return terrainDtoMapper.ToTerrainDto(updatedTerrain);
    }

    @Override
    public TerrainDto trouverTerrainParId(String id) {
        var terrain = terrainDao.trouverTerrainParId(id);
        return terrainDtoMapper.ToTerrainDto(terrain);
    }

    @Override
    public void supprimerTerrain(Long id) {
        terrainDao.supprimerTerrain(id);
    }

    @Override
    public List<TerrainDto> listerTerrains() {
        return terrainDao.listerTerrains().stream()
                .map(terrainDtoMapper::ToTerrainDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<TerrainDto> findByDisponibilite(boolean disponibilite) {
        return terrainDao.findByDisponibilite(disponibilite).stream()
                .map(terrainDtoMapper::ToTerrainDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<TerrainDto> findBySecteurNom(String secteurNom) {
        return terrainDao.findBySecteurNom(secteurNom).stream()
                .map(terrainDtoMapper::ToTerrainDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<TerrainDto> findByResponsableId(String responsableId) {
        return terrainDao.findByResponsableId(responsableId).stream()
                .map(terrainDtoMapper::ToTerrainDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<TerrainDto> SearchTerrainCityandSecteur(String city, String secteur) {
        return terrainDao.SearchTerrainCityandSecteur(city, secteur).stream()
                .map(terrainDtoMapper::ToTerrainDto)
                .collect(Collectors.toList());
    }
}
