package ma.emsi.devoir.commerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends AbstractEntity{
	
	@Column(name="userName",unique=true)
	private String userName;
    
    @Column(name="password")
	private String password;
    
    @Column(name="login")
	private String login;
    
    @Column(name="firstName")
	private String firstName;
    
    @Column(name="lastName")
	private String lastName;
	
    @Column(name="email")
	private String email;
	
    @Column(name="cellPhone", length = 20)
    private String cellPhone;
    
    @Column(name="city")
    private String city;
	@ManyToOne
    private Role role;
	
	@Column(name="image")
	private Image image;
	
	@OneToMany(mappedBy = "user")
	private List<Cart> carts;
}
