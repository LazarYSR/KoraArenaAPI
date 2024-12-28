package ma.ehei.Prj_KoraArenaAPI.Dao;

import ma.ehei.Prj_KoraArenaAPI.Models.Admin;
import ma.ehei.Prj_KoraArenaAPI.Models.City;

import java.util.List;

public interface CityDao {
    City AjouterCity(City city); // Ajouter une ville
    List<City> ListerCities(); // Lister toutes les villes
    City TrouverCityParNom(String nom); // Trouver une ville par nom
    City ModifierCity(City city); // Modifier une ville existante
    void SupprimerCity(String nom); // Supprimer une ville par nom
}
