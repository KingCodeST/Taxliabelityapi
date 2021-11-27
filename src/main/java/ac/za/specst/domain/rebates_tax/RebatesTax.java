package ac.za.specst.domain.rebates_tax;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class RebatesTax {

    @Id
    private String id;
    private String tax_id;
    private String year;
    private Date date;
    private String rate_applicable;
    private int fixed_rebate_amount;


}
