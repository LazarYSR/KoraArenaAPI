package ma.ehei.Prj_KoraArenaAPI.Dao.Impl;

import ma.ehei.Prj_KoraArenaAPI.Dao.CityDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.Impl.Repositories.CityRepository;
import ma.ehei.Prj_KoraArenaAPI.Models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityDaoImpl implements CityDao {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City AjouterCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> ListerCities() {
        return cityRepository.findAll();
    }

    @Override
    public City TrouverCityParNom(String nom) {
        return cityRepository.findById(nom)
                .orElseThrow(() -> new RuntimeException("City introuvable avec le nom : " + nom));
    }

    @Override
    public City ModifierCity(City city) {
        if (!cityRepository.existsById(city.getNom())) {
            throw new RuntimeException("City introuvable avec le nom : " + city.getNom());
        }
        return cityRepository.save(city);
    }

    @Override
    public void SupprimerCity(String nom) {
        if (!cityRepository.existsById(nom)) {
            throw new RuntimeException("City introuvable avec le nom : " + nom);
        }
        cityRepository.deleteById(nom);
    }
}
