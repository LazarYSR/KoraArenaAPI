package ma.ehei.Prj_KoraArenaAPI.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;
import ma.ehei.Prj_KoraArenaAPI.Models.Responsable;
import ma.ehei.Prj_KoraArenaAPI.Models.Secteur;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TerrainDto {

    private Long id;
    private String nom;
    private double longitude;
    private double latitude;
    private boolean disponibilite;

    private Secteur secteur;

    private Responsable responsable;


}
