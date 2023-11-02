package springprac.springAPI.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo
        extends JpaRepository<Students,Long> {

//    Students findStudentEmail(String email);
   // @Query("SELECT s FROM Student s WHERE s.email = ?1")
    //Optional<Students> findStudentByEmail(String email);






}
