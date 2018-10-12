package service;

import domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeaService {

    void addTea(Teacher teacher);

    void deleteTea(int tno);

    void updateTea(Teacher teacher);

    List<Teacher> getAllTea();

    Teacher getTea(int tno);
}
