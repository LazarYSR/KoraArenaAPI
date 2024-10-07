package ma.ehei.Prj_KoraArenaAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Secteur {
    @Id
    private String nomSecteur;
    @Column(length = 120)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityid")
    private City city;

    @OneToMany(mappedBy = "secteur",fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Terrain> terrains =new ArrayList<>();
}
