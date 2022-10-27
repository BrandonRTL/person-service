package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Illness;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IllnessMapper {

    @Select("Select * from person")
    List<Illness> listIllness();
}
