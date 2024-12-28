package ma.ehei.Prj_KoraArenaAPI.Controller;

import ma.ehei.Prj_KoraArenaAPI.Dto.FactureDto;
import ma.ehei.Prj_KoraArenaAPI.Service.FactureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/factures")
public class FactureController {

    @Autowired
    private FactureService factureService;

    @PostMapping
    public FactureDto ajouterFacture(@RequestBody FactureDto factureDto) {
        return factureService.ajouterFacture(factureDto);
    }


    @GetMapping("/{id}")
    public FactureDto trouverFactureParId(@PathVariable String id) {
        return factureService.trouverFactureParId(id);
    }

}
