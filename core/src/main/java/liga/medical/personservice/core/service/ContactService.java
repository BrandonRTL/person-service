package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.AddressMapper;
import liga.medical.personservice.core.mapping.ContactMapper;
import liga.medical.personservice.core.model.Address;
import liga.medical.personservice.core.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactMapper contactMapper;

    @Autowired
    public ContactService(ContactMapper contactMapper) {
        this.contactMapper = contactMapper;
    }

    public List<Contact> getContacts() {
        return  contactMapper.listContacts();
    }
}

