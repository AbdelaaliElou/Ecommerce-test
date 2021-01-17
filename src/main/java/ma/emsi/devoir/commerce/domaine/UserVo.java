package ma.emsi.devoir.commerce.domaine;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserVo extends AbstractEntityVo{
	
	
	private String userName;
    
	private String password;
    

	private String login;
    

	private String firstName;
    

	private String lastName;
	

	private String email;
	

    private String cellPhone;
    
    private String city;
	
	
    private RoleVo role;
	
	
	private ImageVo image;
}
