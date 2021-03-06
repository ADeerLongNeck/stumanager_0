package service;

import dao.GetSessionFactory;
import dao.JiangjiDao;
import dao.XiuXueDao;
import domain.Jiangji;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public interface JiangjiService {



    boolean applyJiangji(Jiangji jiangji);

    void requireJiangji(Jiangji jiangji);

    void shenhe(Jiangji jiangji);

    void queren(Jiangji jiangji);

    void delete(int sno);

    List<Jiangji> getAll(int tno);

    List<Jiangji> get(int sno);

    Jiangji getSingle(int jjno);
}
