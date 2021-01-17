package ma.emsi.devoir.commerce.services.mappers;

import org.mapstruct.Mapper;

import ma.emsi.devoir.commerce.domaine.RoleVo;
import ma.emsi.devoir.commerce.entities.Role;

@Mapper(uses = IUserMapper.class)
public interface IRoleMapper extends IEntityMapper<Role, RoleVo> {

}
