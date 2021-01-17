package ma.emsi.devoir.commerce.services.mappers;

import org.mapstruct.Mapper;

import ma.emsi.devoir.commerce.domaine.CategoryVo;
import ma.emsi.devoir.commerce.entities.Category;
@Mapper(uses=IProductMapper.class)
public interface ICategoryMapper extends IEntityMapper<Category, CategoryVo> {

}
