package service.impl;

import dao.GetSessionFactory;
import dao.JiangjiDao;
import dao.XiuXueDao;
import domain.Jiangji;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.JiangjiService;

import java.util.List;

public class JiangjiServiceImpl implements JiangjiService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    JiangjiDao jiangjiDao = sqlSession.getMapper(JiangjiDao.class);

    @Override
    public void applyJiangji(Jiangji jiangji) {
        jiangjiDao.add(jiangji);
    }

    @Override
    public void requireJiangji(Jiangji jiangji) {
        jiangjiDao.add(jiangji);
        sqlSession.commit();
    }

    @Override
    public void shenhe(Jiangji jiangji) {
        jiangjiDao.update(jiangji);
        sqlSession.commit();
    }

    @Override
    public void queren(Jiangji jiangji) {
        jiangjiDao.update(jiangji);
        sqlSession.commit();
    }

    @Override
    public void delete(int sno) {
        jiangjiDao.delete(sno);
        sqlSession.commit();
    }

    @Override
    public List<Jiangji> getAll() {
        return jiangjiDao.getAll();
    }

    @Override
    public Jiangji get(int sno) {
        return jiangjiDao.get(sno);
    }
}
