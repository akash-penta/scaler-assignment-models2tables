package scaler.assignment.models2tables.joined;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("j_mentor")
public interface MentorRepository
        extends JpaRepository<Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}
