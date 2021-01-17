package ma.emsi.devoir.commerce.services.mappers;

import org.mapstruct.Mapper;

import ma.emsi.devoir.commerce.domaine.ImageVo;
import ma.emsi.devoir.commerce.entities.Image;

@Mapper(uses = {IProductMapper.class})
public interface IImageMapper extends IEntityMapper<Image, ImageVo> {

}
