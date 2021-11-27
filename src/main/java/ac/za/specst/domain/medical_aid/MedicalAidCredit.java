package ac.za.specst.domain.medical_aid;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MedicalAidCredit {

    @Id
    private String id;
    private int fees;
    private int dependants;
    private String tax_id;
    private int total_medical_aid_credit;
    private String year;
    private Date date;

}
