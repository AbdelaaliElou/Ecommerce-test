package ma.emsi.devoir.commerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.emsi.devoir.commerce.entities.Image;

public interface IImageRepository extends JpaRepository<Image, Long> {

}
