package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.service.MedicalCardService;
import liga.medical.personservice.core.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalCardController {
    private final MedicalCardService medicalCardService;

    @Autowired
    public MedicalCardController(MedicalCardService medicalCardService) {
        this.medicalCardService = medicalCardService;
    }

    @GetMapping(path = "/cards", produces = "application/json")
    public List<MedicalCard> getCards() {
        return medicalCardService.getCards();
    }
}
