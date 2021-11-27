package ac.za.specst.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor(access =accessLevel.PROTECTED)
public class User {
    
    
    private String id;
    private String firstName;
    private String lastName;
    private int income;
    
}
