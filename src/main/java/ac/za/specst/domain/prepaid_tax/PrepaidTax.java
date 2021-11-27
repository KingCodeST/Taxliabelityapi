package ac.za.specst.domain.prepaid_tax;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PrepaidTax {

    @Id
    private String id;
    private int employee_tax;
    private int provisional_tax;
    private String tax_id;
    private String year;
    private Date date;
    
    
    
}
