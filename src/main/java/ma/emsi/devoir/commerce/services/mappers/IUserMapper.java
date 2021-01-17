package ma.emsi.devoir.commerce.services.mappers;

import org.mapstruct.Mapper;

import ma.emsi.devoir.commerce.domaine.UserVo;
import ma.emsi.devoir.commerce.entities.User;

@Mapper(uses = {IRoleMapper.class, IImageMapper.class, ICartMapper.class})
public interface IUserMapper extends IEntityMapper<User, UserVo> {

}
