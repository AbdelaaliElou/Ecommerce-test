package ma.emsi.devoir.commerce.services.services;

import org.springframework.data.domain.Page;

import ma.emsi.devoir.commerce.domaine.ProductVo;
import ma.emsi.devoir.commerce.entities.Product;

public interface IProductService extends ICrudService<Product, ProductVo>{
	Page<ProductVo> findByPriceRange(Double min, Double max);	
}
