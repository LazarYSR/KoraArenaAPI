package ma.ehei.Prj_KoraArenaAPI.Service;

import ma.ehei.Prj_KoraArenaAPI.Dto.CityDto;
import ma.ehei.Prj_KoraArenaAPI.Models.City;

import java.util.List;

public interface CityService {
    CityDto ajouterCity(CityDto cityDto);
    List<CityDto> listerCities();
    CityDto trouverCityParNom(String nom);
    CityDto modifierCity(CityDto cityDto);
    void supprimerCity(String nom);
}
