package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Address;
import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.service.AddressService;
import liga.medical.personservice.core.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {

        this.addressService = addressService;
    }

    @GetMapping(path = "/addresses", produces = "application/json")
    public List<Address> getAddresses() {
        return addressService.getAddress();
    }
}
