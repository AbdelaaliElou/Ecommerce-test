package ma.emsi.devoir.commerce.services.services;

import java.util.List;

import org.springframework.data.domain.Page;

public interface ICrudService<E,T> {
E saveOrUpdate(T t);
	
	void delete(long id);
	/**
	 * @return List<T>
	 * */
	List<T> findAll();
	
	T findById(Long id);
	
	
	Page<T> findByCriteria(T t);
}
