package ma.emsi.devoir.commerce.services.mappers;

import org.mapstruct.Mapper;

import ma.emsi.devoir.commerce.domaine.CartProductVo;
import ma.emsi.devoir.commerce.entities.CartProduct;
@Mapper(uses= {ICartMapper.class, IProductMapper.class})
public interface ICartProdutMapper extends IEntityMapper<CartProduct, CartProductVo> {

}
