package ac.za.specst.domain.tax;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Tax {

    @Id
    private String id;
    private String user_id;
    private String tax_id;
    private String year;
    private Date date;
    private int rebates;
    private int prepaid_tax;
    private int tax_liability;
    private int medical_aid_credit;


}
