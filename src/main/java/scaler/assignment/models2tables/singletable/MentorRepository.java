package scaler.assignment.models2tables.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scaler.assignment.models2tables.singletable.Mentor;

@Repository("st_mentor")
public interface MentorRepository
        extends JpaRepository<Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}
