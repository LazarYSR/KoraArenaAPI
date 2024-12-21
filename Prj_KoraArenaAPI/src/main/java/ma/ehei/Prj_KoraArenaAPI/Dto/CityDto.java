package ma.ehei.Prj_KoraArenaAPI.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;

import java.util.Collection;
@Data
@NoArgsConstructor @AllArgsConstructor
public class CityDto {

    private String nom;

    private Long zipCode;

}
