package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.ResponsableDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.ResponsableRepository;
import ma.ehei.Prj_KoraArenaAPI.Models.Responsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResponsableDaoImpl implements ResponsableDao {

    @Autowired
    private ResponsableRepository responsableRepository;

    @Override
    public Responsable ajouterResponsable(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

    @Override
    public List<Responsable> listerResponsables() {
        return responsableRepository.findAll();
    }

    @Override
    public Responsable trouverResponsableParId(String id) {
        return responsableRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Responsable not found with id: " + id));
    }

    @Override
    public Responsable modifierResponsable(Responsable responsable) {
        if (!responsableRepository.existsById(responsable.getCin())) {
            throw new RuntimeException("Responsable not found with id: " + responsable.getCin());
        }
        return responsableRepository.save(responsable);
    }

    @Override
    public void supprimerResponsable(String id) {
        if (!responsableRepository.existsById(id)) {
            throw new RuntimeException("Responsable not found with id: " + id);
        }
        responsableRepository.deleteById(id);
    }
}
