package ma.ehei.Prj_KoraArenaAPI.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public enum Paiement {
    CarteBancaire,
    Wallet,
    Espèce
}
