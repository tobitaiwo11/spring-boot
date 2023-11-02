package springprac.springAPI.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class serviceLayer {

    private  final StudentRepo studentrepo;

    @Autowired
    public serviceLayer(StudentRepo studentrepo) {
        this.studentrepo = studentrepo;
    }


    public List<Students> getStudents(){

        return  studentrepo.findAll();

//        return List.of(new Students(
//                1L,"tobi","t@gmail.com", LocalDate.of(2000, Month.JANUARY,5),29));
    }


    public void addNewStudsnt(Students student) {

//      Optional<Students> studentByEmail =
//              studentrepo.findStudentByEmail(student.getEmail());
//
//      if (studentByEmail.isPresent()){
//          throw new IllegalStateException("email taken");
//      }

        studentrepo.save(student);

        System.out.println(student);


    }

    public void deleteStudent(Long id) {

        studentrepo.deleteById(id);
    }
}
