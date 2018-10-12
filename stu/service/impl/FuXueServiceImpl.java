package service.impl;

import dao.FuXueDao;
import dao.GetSessionFactory;
import dao.XiuXueDao;
import domain.FuXue;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.FuXueService;

import java.util.List;

public class FuXueServiceImpl implements FuXueService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    XiuXueDao xiuXueDao = sqlSession.getMapper(XiuXueDao.class);
    FuXueDao fuXueDao = sqlSession.getMapper(FuXueDao.class);


    @Override
    public void applyFuXue(FuXue fuXue) {
        fuXueDao.add(fuXue);
        sqlSession.commit();
    }

    @Override
    public void shenhe(FuXue fuXue) {
        fuXueDao.update(fuXue);
        if (fuXue.getShzt().equals("同意复学")){
            xiuXueDao.delete(fuXue.getSno());
        }
        sqlSession.commit();
    }

    @Override
    public List<FuXue> getAll() {
        return fuXueDao.getAll();
    }

    @Override
    public FuXue get(int fxno) {
        return fuXueDao.get(fxno);
    }

    @Override
    public void delete(int fxno) {
        fuXueDao.delete(fxno);
    }
}
