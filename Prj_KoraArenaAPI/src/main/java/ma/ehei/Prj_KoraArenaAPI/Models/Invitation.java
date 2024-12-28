package ma.ehei.Prj_KoraArenaAPI.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invitation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private StatusEnum Status;

    @ManyToOne(fetch = FetchType.EAGER)
    private Reservation reservation;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notificationid")
    private Notification notification;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userInviter")
    private User userInviter;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userRecepteur")
    private User userRecepteur;
}
