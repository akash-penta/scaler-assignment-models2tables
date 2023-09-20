package scaler.assignment.models2tables.joined;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("j_student")
public interface StudentRepository
    extends JpaRepository<Student, Long> {
    @Override
    <S extends Student> S save(S entity);
}
