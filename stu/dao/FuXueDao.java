package dao;

import domain.FuXue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FuXueDao {

    void add(FuXue fuXue);

    void delete(@Param("sno")int sno);

    void update(FuXue fuXue);

    List<FuXue> getAll();

    FuXue get(@Param("sno")int sno);
}
