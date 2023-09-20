package scaler.assignment.models2tables.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scaler.assignment.models2tables.singletable.TA;

@Repository("st_ta")
public interface TARepository
    extends JpaRepository<TA, Long> {
    @Override
    <S extends TA> S save(S entity);
}
