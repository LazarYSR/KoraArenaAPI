package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.TerrainDto;

import java.util.List;

public interface TerrainService {
    public List<TerrainDto> ChercherTerrainsParVilleEtSecteur(String ville, String secteur);
}
