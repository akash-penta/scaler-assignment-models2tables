package scaler.assignment.models2tables.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scaler.assignment.models2tables.singletable.Student;

@Repository("st_student")
public interface StudentRepository
    extends JpaRepository<Student, Long> {
    @Override
    <S extends Student> S save(S entity);
}
