package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ContactMapper {

    @Select("Select * from person")
    List<Contact> listContacts();
}
