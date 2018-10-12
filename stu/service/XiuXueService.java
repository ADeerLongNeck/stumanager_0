package service;

import domain.XiuXue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XiuXueService {


    XiuXue get(int xxno);

    List<XiuXue> getAll();

    void applyXiuxue(XiuXue xiuXue);

    void shenhe(XiuXue xiuXue);

    void delete(int xxno);
}
