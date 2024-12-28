package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.FactureDao;
import ma.ehei.Prj_KoraArenaAPI.Dao.ReservationDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.ReservationDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.ReservationDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Models.Facture;
import ma.ehei.Prj_KoraArenaAPI.Models.Paiement;
import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;
import ma.ehei.Prj_KoraArenaAPI.Services.ReservationService;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {


    private ReservationDao reservationDao;
    private FactureDao factureDao;

    private ReservationDtoMapper mapper;

    @Override
    public ReservationDto ajouterReservation(ReservationDto reservationDto) {

        Reservation reservation = mapper.toReservation(reservationDto);
        Reservation savedReservation = reservationDao.ajouterReservation(reservation);


        Facture facture = new Facture();
        facture.setId(UUID.randomUUID().toString());
        facture.setMontantTotal(savedReservation.getMontant());
        facture.setModePaiement(Paiement.Espèce);
        facture.setDatePaiement(new Date());
        facture.setReservation(savedReservation);

        factureDao.AjouterFacture(facture);


        return mapper.toReservationDto(savedReservation);
    }


    @Override
    public List<ReservationDto> listerReservations() {
        return reservationDao.listerReservations().stream()
                .map(mapper::toReservationDto)
                .collect(Collectors.toList());
    }

    @Override
    public ReservationDto trouverReservationParId(String id) {
        return mapper.toReservationDto(reservationDao.trouverReservationParId(id));
    }

    @Override
    public ReservationDto modifierReservation(ReservationDto reservationDto) {
        return mapper.toReservationDto(reservationDao.modifierReservation(mapper.toReservation(reservationDto)));
    }

    @Override
    public void supprimerReservation(String id) {
        reservationDao.supprimerReservation(id);
    }

    @Override
    public List<ReservationDto> findByDateReservation(Date dateReservation) {
        return reservationDao.findByDateReservation(dateReservation).stream()
                .map(mapper::toReservationDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReservationDto> findByUserId(String userId) {
        return reservationDao.findByUserId(userId).stream()
                .map(mapper::toReservationDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReservationDto> findByTerrainId(Long terrainId) {
        return reservationDao.findByTerrainId(terrainId).stream()
                .map(mapper::toReservationDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReservationDto> findByStatusReservation(String status) {
        return reservationDao.findByStatusReservation(status).stream()
                .map(mapper::toReservationDto)
                .collect(Collectors.toList());
    }
}
