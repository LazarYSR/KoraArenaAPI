package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;

import java.util.List;

public interface SecteurDao {
    List<Secteur> finSecteursInCity(String s);
}
