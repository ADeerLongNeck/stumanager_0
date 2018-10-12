package dao;

import domain.Teacher;

import java.util.List;

public interface TeaDao {

    void addTea(Teacher teacher);

    void deleteTea(int tno);

    void updateTea(Teacher teacher);

    List<Teacher> getAllTea();

    Teacher getTea(int tno);
}
