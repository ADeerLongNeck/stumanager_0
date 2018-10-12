package service;

import domain.Student;

import java.util.List;

public interface StuService {

    void addStudent(Student student);

    List<Student> getStudent();

    void deleteStudent(Student student);

    void updateStudent(Student student);

    Student getSingleStudent(int sno);
}
