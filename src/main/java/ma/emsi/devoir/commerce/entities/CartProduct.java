package ma.emsi.devoir.commerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
@Table(name = "cart_products")
public class CartProduct extends AbstractEntity{
	
	@ManyToOne
	private Cart cart;
    
    @ManyToOne
	private Product product;
   
    @Column(name="amount")
	private int amount;
}
