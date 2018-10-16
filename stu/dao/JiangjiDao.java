package dao;

import domain.Jiangji;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiangjiDao {

    void add(Jiangji jiangji);

    void delete(@Param("sno")int sno);

    void update(Jiangji jiangji);

    List<Jiangji> getAll(@Param("xy") String xy);

    List<Jiangji> get(@Param("sno")int sno);

    Jiangji getSingle(@Param("jjno")int jjno);
}
