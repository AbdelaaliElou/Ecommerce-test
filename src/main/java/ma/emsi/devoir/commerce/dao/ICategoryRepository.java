package ma.emsi.devoir.commerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.devoir.commerce.entities.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
