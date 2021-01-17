package ma.emsi.devoir.commerce.services.mappers;

import org.mapstruct.Mapper;

import ma.emsi.devoir.commerce.domaine.ProductVo;
import ma.emsi.devoir.commerce.entities.Product;

@Mapper(uses = {ICategoryMapper.class, IImageMapper.class, ICartProdutMapper.class})
public interface IProductMapper extends IEntityMapper<Product, ProductVo> {

}
