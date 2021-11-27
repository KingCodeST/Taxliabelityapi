package ac.za.specst.domain.income;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class IncomeTax {

    @Id
    private String id;
    private double total_income;
    private double bracket;
    private double foreign_income;
    private double rates_applicable_percentage;
    private String tax_id;
    private String year;
    private Date date;


}
