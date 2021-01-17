package ma.emsi.devoir.commerce.services.mappers;

import java.util.List;

public interface IEntityMapper<E, D> {
	E toEntity(D dto);
	D toDto(E entity);
	List<E> toEntity(List<D> listDto);
	List<D> toDto(List<E> listEntity);
}
