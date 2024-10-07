package ma.ehei.Prj_KoraArenaAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String message;
    @Temporal(TemporalType.TIMESTAMP)
    private Date envoyerA;

    @OneToOne(mappedBy = "notification")
    @JoinColumn(name = "invitationid")
    private Invitation invitation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userrecepteur")
    private User user;


}
