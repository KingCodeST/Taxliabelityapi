package ac.za.specst.domain.medical_aid;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AdditionalMedicalAidCredit {

    @Id
    private String id;
    private double excess_annual_contribution;
    private double qualifying_medical_expense;
    private double excess_medical_expense;
    private double total_tax_credit;
    private double medical_aid_credit_id;
    private String year;
    private Date date;

}
