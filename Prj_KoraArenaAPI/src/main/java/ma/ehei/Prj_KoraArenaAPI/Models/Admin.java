package ma.ehei.Prj_KoraArenaAPI.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Admin extends Personne{

}
