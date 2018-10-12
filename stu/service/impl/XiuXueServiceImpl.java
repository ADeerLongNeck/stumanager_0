package service.impl;

import dao.FuXueDao;
import dao.GetSessionFactory;
import dao.XiuXueDao;
import domain.XiuXue;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.XiuXueService;

import java.util.List;

public class XiuXueServiceImpl implements XiuXueService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    XiuXueDao xiuXueDao = sqlSession.getMapper(XiuXueDao.class);
    FuXueDao fuXueDao = sqlSession.getMapper(FuXueDao.class);


    @Override
    public XiuXue get(int xxno) {
        return xiuXueDao.get(xxno);
    }

    @Override
    public List<XiuXue> getAll() {
        return xiuXueDao.getAll();
    }

    @Override
    public void applyXiuxue(XiuXue xiuXue) {
        xiuXueDao.add(xiuXue);
        sqlSession.commit();
    }

    @Override
    public void shenhe(XiuXue xiuXue) {
        xiuXueDao.update(xiuXue);
        sqlSession.commit();
    }

    @Override
    public void delete(int xxno) {
        xiuXueDao.delete(xxno);
        sqlSession.commit();
    }
}
