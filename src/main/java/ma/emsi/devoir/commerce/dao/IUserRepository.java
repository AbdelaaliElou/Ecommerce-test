package ma.emsi.devoir.commerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.devoir.commerce.entities.User;

@Repository 
public interface IUserRepository extends JpaRepository<User, Long> {

}
