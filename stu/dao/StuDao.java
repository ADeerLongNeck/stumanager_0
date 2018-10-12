package dao;

import domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuDao {

    void addStudent(Student student);

    List<Student> getStudent();

    void deleteStudent(Student student);

    void updateStudent(Student student);

    Student getSingleStudent(@Param("sno") int sno);

}
