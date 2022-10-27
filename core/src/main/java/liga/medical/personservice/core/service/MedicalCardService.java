package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.MedicalCardMapper;
import liga.medical.personservice.core.mapping.PersonMapper;
import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.model.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCardService {

    private final MedicalCardMapper medicalCardMapper;

    @Autowired
    public MedicalCardService(MedicalCardMapper medicalCardMapper) {

        this.medicalCardMapper = medicalCardMapper;
    }

    public List<MedicalCard> getCards() {

        return  medicalCardMapper.listMedicalCards();
    }
}
