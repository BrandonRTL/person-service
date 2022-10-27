package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.PersonMapper;
import liga.medical.personservice.core.model.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonMapper personMapper;

    @Autowired
    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<PersonData> getPersons() {
        return  personMapper.listPersons();
    }
}
