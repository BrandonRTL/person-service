package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.IllnessMapper;
import liga.medical.personservice.core.mapping.PersonMapper;
import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.model.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessService {

    private final IllnessMapper illnessMapper;

    @Autowired
    public IllnessService(IllnessMapper illnessMapper) {

        this.illnessMapper = illnessMapper;
    }

    public List<Illness> getIllnesses() {

        return  illnessMapper.listIllness();
    }
}
