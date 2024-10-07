package ma.ehei.Prj_KoraArenaAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    private String nom;
    @Column(unique = true)
    private Long zipCode;
    @OneToMany(mappedBy = "city",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Secteur> secteurs;
}
