package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.FactureDto;

import java.util.List;

public interface FactureService {
    FactureDto ajouterFacture(FactureDto factureDto);
    FactureDto trouverFactureParId(String id);

}
