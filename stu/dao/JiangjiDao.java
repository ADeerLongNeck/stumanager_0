package dao;

import domain.Jiangji;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiangjiDao {

    void add(Jiangji jiangji);

    void delete(@Param("sno")int sno);

    void update(Jiangji jiangji);

    List<Jiangji> getAll();

    Jiangji get(@Param("sno")int sno);
}
