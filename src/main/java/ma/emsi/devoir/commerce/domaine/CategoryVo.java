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

public class CategoryVo extends AbstractEntityVo{
	private String label;
}
