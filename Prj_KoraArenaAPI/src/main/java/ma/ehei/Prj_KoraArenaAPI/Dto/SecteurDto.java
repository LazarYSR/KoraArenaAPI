package ma.ehei.Prj_KoraArenaAPI.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Models.City;
import ma.ehei.Prj_KoraArenaAPI.Models.Terrain;

import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecteurDto {

    private String nomSecteur;

    private String description;

    private String cityid;

}
