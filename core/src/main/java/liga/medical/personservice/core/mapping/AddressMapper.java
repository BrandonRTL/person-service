package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AddressMapper {

    @Select("Select * from person")
    List<Address> listAddresses();
}
