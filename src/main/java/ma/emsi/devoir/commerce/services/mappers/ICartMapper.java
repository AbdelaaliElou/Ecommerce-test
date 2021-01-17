package ma.emsi.devoir.commerce.services.mappers;

import org.mapstruct.Mapper;

import ma.emsi.devoir.commerce.domaine.CartVo;
import ma.emsi.devoir.commerce.entities.Cart;
@Mapper(uses = {IUserMapper.class, ICartProdutMapper.class})
public interface ICartMapper extends IEntityMapper<Cart, CartVo> {

}
