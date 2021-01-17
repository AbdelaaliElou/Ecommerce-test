package ma.emsi.devoir.commerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "images")
public class Image extends AbstractEntity{
	
	@Lob
    @Column(name = "image", columnDefinition="BLOB")
	private byte[] image;
	@ManyToOne
	private Product product;
}
