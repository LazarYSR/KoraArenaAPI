package ma.ehei.Prj_KoraArenaAPI.Mappers;

import ma.ehei.Prj_KoraArenaAPI.Dto.ReservationDto;
import ma.ehei.Prj_KoraArenaAPI.Models.Reservation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ReservationDtoMapper {
    public Reservation toReservation(ReservationDto dto) {
        Reservation reservation = new Reservation();
        BeanUtils.copyProperties(dto, reservation);
        return reservation;
    }

    public ReservationDto toReservationDto(Reservation reservation) {
        ReservationDto dto = new ReservationDto();
        BeanUtils.copyProperties(reservation, dto);
        return dto;
    }
}
