package ma.emsi.devoir.commerce.domaine;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEntityVo {
	
	private Long id;
	

	private Date createdAt;
	
	

	private Date updatedAt;
}
