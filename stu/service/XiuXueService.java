package service;

import domain.XiuXue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XiuXueService {


    List<XiuXue> get(int sno);

    XiuXue getSingle(int xxno);

    List<XiuXue> getAll(int tno);

    boolean applyXiuxue(XiuXue xiuXue);

    void shenhe(XiuXue xiuXue);

    void delete(int xxno);
}
