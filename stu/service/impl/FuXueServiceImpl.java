package service.impl;

import dao.*;
import domain.FuXue;
import domain.Student;
import domain.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.FuXueService;

import java.util.List;

public class FuXueServiceImpl implements FuXueService {

    private SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    private SqlSession sqlSession = sqlSessionFactory.openSession();
    private XiuXueDao xiuXueDao = sqlSession.getMapper(XiuXueDao.class);
    private FuXueDao fuXueDao = sqlSession.getMapper(FuXueDao.class);
    private StuDao stuDao = sqlSession.getMapper(StuDao.class);
    private TeaDao teaDao = sqlSession.getMapper(TeaDao.class);


    @Override
    public void applyFuXue(FuXue fuXue) {
        fuXueDao.add(fuXue);
        sqlSession.commit();
    }

    @Override
    public void shenhe(FuXue fuXue) {
        Student student = new Student();

        if (fuXue.getShzt().equals("审核通过")){
            student.setXiuxue("no");
            stuDao.updateStudent(student);
        }else if (fuXue.getShzt().equals("审核不通过")){
            student.setXiuxue("yes");
            stuDao.updateStudent(student);
        }
        fuXueDao.update(fuXue);
        sqlSession.commit();
    }

    @Override
    public List<FuXue> getAll(int tno) {
        Teacher teacher = teaDao.getTea(tno);
        String xy = teacher.getSsxy();
        return fuXueDao.getAll(xy);
    }

    @Override
    public List<FuXue> get(int sno) {
        return fuXueDao.get(sno);
    }

    @Override
    public FuXue getSingle(int fxno) {
        return fuXueDao.getSingle(fxno);
    }

    @Override
    public void delete(int fxno) {
        fuXueDao.delete(fxno);
        sqlSession.commit();
    }
}
