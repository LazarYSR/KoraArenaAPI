package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.FactureDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.FactureDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.FactureDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.Facture;

import ma.ehei.Prj_KoraArenaAPI.Service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FactureServiceImpl implements FactureService {


    private FactureDao factureDao;

    private FactureDtoMapper factureDtoMapper;

    @Override
    public FactureDto ajouterFacture(FactureDto factureDto) {
        Facture facture = factureDtoMapper.toFacture(factureDto);
        facture.setId(UUID.randomUUID().toString());
        Facture savedFacture = factureDao.AjouterFacture(facture);
        return factureDtoMapper.toFactureDto(savedFacture);
    }



    @Override
    public FactureDto trouverFactureParId(String id) {
        Facture facture = factureDao.FindFactureByID(id);
        if (facture == null) {
            throw new RuntimeException("Facture not found");
        }
        return factureDtoMapper.toFactureDto(facture);
    }


}
