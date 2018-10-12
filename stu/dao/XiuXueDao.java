package dao;

import domain.XiuXue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XiuXueDao {

    void add(XiuXue xiuXue);

    void delete(@Param("sno")int sno);

    void update(XiuXue xiuXue);

    List<XiuXue> getAll();

    XiuXue get(@Param("sno") int sno);
}
