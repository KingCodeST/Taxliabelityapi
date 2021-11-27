package ac.za.specst.domain.user;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {
    
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int income;
    private String year;
    private String password;
    private String description;
    private boolean isActive;
    private String userRoleId;

    
}
