package scaler.assignment.models2tables.joined;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("j_user")
public interface UserRepository
        extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}