package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Admin;
import ma.ehei.Prj_KoraArenaAPI.Models.Responsable;

import java.util.List;

public interface ResponsableDao {
    Responsable ajouterResponsable(Responsable responsable);
    List<Responsable> listerResponsables();
    Responsable trouverResponsableParId(String id);
    Responsable modifierResponsable(Responsable responsable);
    void supprimerResponsable(String id);
}
