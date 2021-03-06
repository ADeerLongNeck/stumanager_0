package dao;

import domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeaDao {

    void addTea(Teacher teacher);

    void deleteTea(@Param("tno") int tno);

    void updateTea(Teacher teacher);

    List<Teacher> getAllTea();

    Teacher getTea(@Param("tno") int tno);
}
