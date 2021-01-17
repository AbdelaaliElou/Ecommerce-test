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
@Table(name = "products")
public class Product extends AbstractEntity{
	
	@Column(name="reference")
	private String reference;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="price")
	private double price;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy = "product")
	private List<Image> images;
	
	@OneToMany(mappedBy = "product")
	private List<CartProduct> cartproducts;
}
