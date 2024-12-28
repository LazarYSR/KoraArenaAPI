package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.FactureDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Facture;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class FactureDtoMapper {
    public Facture toFacture(FactureDto factureDto) {
        Facture facture = new Facture();
        BeanUtils.copyProperties(factureDto, facture);
        return facture;
    }

    public FactureDto toFactureDto(Facture facture) {
        FactureDto factureDto = new FactureDto();
        BeanUtils.copyProperties(facture, factureDto);
        return factureDto;
    }
}
