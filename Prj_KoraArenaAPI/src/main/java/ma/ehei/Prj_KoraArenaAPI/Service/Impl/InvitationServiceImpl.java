package ma.ehei.Prj_KoraArenaAPI.Service.Impl;

import lombok.AllArgsConstructor;
import ma.ehei.Prj_KoraArenaAPI.Dao.InvitationDao;
import ma.ehei.Prj_KoraArenaAPI.Dto.InvitationDto;
import ma.ehei.Prj_KoraArenaAPI.Mappers.InvitationDtoMapper;
import ma.ehei.Prj_KoraArenaAPI.Service.InvitationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class InvitationServiceImpl implements InvitationService {

    private final InvitationDao invitationDao;
    private final InvitationDtoMapper invitationDtoMapper;

    @Override
    public InvitationDto addInvitation(InvitationDto invitationDto) {
        var invitation = invitationDtoMapper.toInvitation(invitationDto);
        return invitationDtoMapper.toInvitationDto(invitationDao.addInvitation(invitation));
    }

    @Override
    public List<InvitationDto> listInvitations() {
        return invitationDao.listInvitations().stream()
                .map(invitationDtoMapper::toInvitationDto)
                .collect(Collectors.toList());
    }

    @Override
    public InvitationDto findInvitationById(Long id) {
        return invitationDtoMapper.toInvitationDto(invitationDao.findInvitationById(id));
    }

    @Override
    public List<InvitationDto> findByReservation(String reservationId) {
        return invitationDao.findByReservation(reservationId).stream()
                .map(invitationDtoMapper::toInvitationDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<InvitationDto> findByUserRecepteur(String userRecepteurId) {
        return invitationDao.findByUserRecepteur(userRecepteurId).stream()
                .map(invitationDtoMapper::toInvitationDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<InvitationDto> findByUserInviter(String userInviterId) {
        return invitationDao.findByUserInviter(userInviterId).stream()
                .map(invitationDtoMapper::toInvitationDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteInvitation(Long id) {
        invitationDao.deleteInvitation(id);
    }
}
