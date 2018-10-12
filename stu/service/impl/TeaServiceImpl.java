package service.impl;

import dao.GetSessionFactory;
import dao.StuDao;
import dao.TeaDao;
import domain.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.TeaService;

import java.util.List;

public class TeaServiceImpl implements TeaService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    TeaDao teaDao = sqlSession.getMapper(TeaDao.class);

    @Override
    public void addTea(Teacher teacher) {
        teaDao.addTea(teacher);
        sqlSession.commit();
    }

    @Override
    public void deleteTea(int tno) {
        teaDao.deleteTea(tno);
        sqlSession.commit();
    }

    @Override
    public void updateTea(Teacher teacher) {
        teaDao.updateTea(teacher);
        sqlSession.commit();
    }

    @Override
    public List<Teacher> getAllTea() {
        return teaDao.getAllTea();
    }

    @Override
    public Teacher getTea(int tno) {
        return teaDao.getTea(tno);
    }
}
