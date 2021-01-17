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

public class CartProductVo extends AbstractEntityVo{
	


	private CartVo cart;
    


	private ProductVo product;
   
	private int amount;
}
