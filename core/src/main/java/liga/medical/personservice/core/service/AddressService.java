package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.AddressMapper;
import liga.medical.personservice.core.mapping.PersonMapper;
import liga.medical.personservice.core.model.Address;
import liga.medical.personservice.core.model.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressMapper addressMapper;

    @Autowired
    public AddressService(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public List<Address> getAddress() {
        return  addressMapper.listAddresses();
    }
}
