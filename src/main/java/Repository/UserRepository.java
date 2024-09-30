package Repository;

import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface UserRepository<T extends User> extends JpaRepository<T, Integer> {

    Optional<T> findByEmail(String email);

    @Query("SELECT u FROM Client u WHERE u.email = :email AND u.password = :password")
    Optional<T> findByEmailAndPassword(@Param("email") String email, @Param("password")String password);
}
