package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.CityDto;
import ma.ehei.Prj_KoraArenaAPI.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityService cityService;


    @PostMapping("/add")
    public ResponseEntity<CityDto> ajouterCity(@RequestBody CityDto cityDto) {
        CityDto addedCity = cityService.ajouterCity(cityDto);
        return new ResponseEntity<>(addedCity, HttpStatus.CREATED);
    }


    @GetMapping("/all")
    public ResponseEntity<List<CityDto>> listerCities() {
        List<CityDto> cities = cityService.listerCities();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping("/find/{nom}")
    public ResponseEntity<CityDto> trouverCityParNom(@PathVariable String nom) {
        CityDto city = cityService.trouverCityParNom(nom);
        if (city != null) {
            return new ResponseEntity<>(city, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping("/update")
    public ResponseEntity<CityDto> modifierCity(@RequestBody CityDto cityDto) {
        CityDto updatedCity = cityService.modifierCity(cityDto);
        return new ResponseEntity<>(updatedCity, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{nom}")
    public ResponseEntity<Void> supprimerCity(@PathVariable String nom) {
        cityService.supprimerCity(nom);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
