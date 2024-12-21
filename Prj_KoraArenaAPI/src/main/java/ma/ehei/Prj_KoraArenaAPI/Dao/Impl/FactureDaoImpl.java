package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.FactureDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.FactureRepository;
import ma.ehei.Prj_KoraArenaAPI.Models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FactureDaoImpl implements FactureDao {
    @Autowired
    private FactureRepository factureRepository;
    @Override
    public Facture AjouterFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture FindFactureByID(String id) {return factureRepository.findAvecId(id);
    }


}
