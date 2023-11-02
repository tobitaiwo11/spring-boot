package springprac.springAPI.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class controller {

    private final serviceLayer studentService;

    @Autowired
    public controller(serviceLayer studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Students> getStudents(){

        return studentService.getStudents();
    }

    @PostMapping()
    public void registerNewStudents(@RequestBody Students student){

        studentService.addNewStudsnt(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable ("studentId") Long id){

        studentService.deleteStudent(id);

    }


}
