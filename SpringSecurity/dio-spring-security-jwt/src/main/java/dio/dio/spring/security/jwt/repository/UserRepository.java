package dio.dio.spring.security.jwt.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public class UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param("username") String username);

    boolean existsByUsername(String username);
}
