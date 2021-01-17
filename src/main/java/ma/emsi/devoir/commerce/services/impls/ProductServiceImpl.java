package ma.emsi.devoir.commerce.services.impls;

import java.util.List;

import org.springframework.data.domain.Page;

import ma.emsi.devoir.commerce.domaine.ProductVo;
import ma.emsi.devoir.commerce.entities.Product;
import ma.emsi.devoir.commerce.services.services.IProductService;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product saveOrUpdate(ProductVo t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ProductVo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductVo findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProductVo> findByCriteria(ProductVo t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProductVo> findByPriceRange(Double min, Double max) {
		// TODO Auto-generated method stub
		return null;
	}

}
