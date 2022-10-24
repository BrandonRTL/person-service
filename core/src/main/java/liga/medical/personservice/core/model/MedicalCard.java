package liga.medical.personservice.core.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Data
public class MedicalCard {

    @Id
    @NonNull
    private long id;

    private String clientStatus;

    private String medStatus;

    @NonNull
    private Date registryDt;

    private String comment;
}

