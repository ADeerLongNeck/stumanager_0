package service;

import domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuService {

    void addStudent(Student student);

    List<Student> getAll();

    List<Student> getStudent(int tno);

    void deleteStudent(Student student);

    void updateStudent(Student student);

    Student getSingleStudent(int sno);

    void dengji(int sno);
}
