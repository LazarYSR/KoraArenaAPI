package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.CityDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.CityDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.AdminDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Mappers.CityDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.City;
import ma.ehei.Prj_KoraArenaAPI.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {

   private CityDtoMapper cityDtoMapper;
    private CityDao cityDao;

    @Override
    public CityDto ajouterCity(CityDto cityDto) {
        City city = cityDtoMapper.ToCity(cityDto);
        City savedCity = cityDao.AjouterCity(city);
        return cityDtoMapper.ToCityDto(savedCity);
    }

    @Override
    public List<CityDto> listerCities() {
        List<City> cities = cityDao.ListerCities();
        return cities.stream()
                .map(cityDtoMapper::ToCityDto)
                .collect(Collectors.toList());
    }

    @Override
    public CityDto trouverCityParNom(String nom) {
        City city = cityDao.TrouverCityParNom(nom);
        return cityDtoMapper.ToCityDto(city);
    }

    @Override
    public CityDto modifierCity(CityDto cityDto) {
        City city = cityDtoMapper.ToCity(cityDto);
        City updatedCity = cityDao.ModifierCity(city);
        return cityDtoMapper.ToCityDto(updatedCity);
    }

    @Override
    public void supprimerCity(String nom) {
        cityDao.SupprimerCity(nom);
    }

}
