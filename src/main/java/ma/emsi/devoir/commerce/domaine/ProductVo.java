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

public class ProductVo extends AbstractEntityVo{
	

	private String reference;
	

	private String designation;
	
	
	private double price;
	
	
	
	private ImageVo image;
}
