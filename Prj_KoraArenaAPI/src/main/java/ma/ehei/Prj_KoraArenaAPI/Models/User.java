package ma.ehei.Prj_KoraArenaAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor @EqualsAndHashCode(callSuper = true)
@Table(name = "utilisateur")
public class User extends Personne{
    @Id
    private String cin;
    private boolean active;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Notification> notifications;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Reservation> reservations;

    @OneToMany(mappedBy = "userInviter", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Invitation> invitationsEnvoyees;

    @OneToMany(mappedBy = "userRecepteur", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Invitation> invitationsRecues;


}
