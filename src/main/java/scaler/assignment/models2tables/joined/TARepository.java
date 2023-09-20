package scaler.assignment.models2tables.joined;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("j_ta")
public interface TARepository
    extends JpaRepository<TA, Long> {
    @Override
    <S extends TA> S save(S entity);
}
