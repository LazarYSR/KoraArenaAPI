package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.CityDto;
import ma.ehei.Prj_KoraArenaAPI.Models.City;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CityDtoMapper {

    public CityDto ToCityDto(City city) {
        CityDto citydto = new CityDto();

        BeanUtils.copyProperties(city,citydto);
        return citydto;
    }
    public City ToCity(CityDto citydto) {
        City city = new City();

        BeanUtils.copyProperties(citydto,city);
        return city;
    }
}
