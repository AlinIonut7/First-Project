package Student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service

public class StudentService {
    @GetMapping
    public static List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Alex",
                        "alexcowboy@yahoo.com",
                        LocalDate.of(2001, Month.DECEMBER,14),
                        20
                )
        );




    }
}
