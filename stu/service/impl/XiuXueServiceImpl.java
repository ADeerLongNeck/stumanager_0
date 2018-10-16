package service.impl;

import dao.*;
import domain.Student;
import domain.Teacher;
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
    StuDao stuDao = sqlSession.getMapper(StuDao.class);
    TeaDao teaDao = sqlSession.getMapper(TeaDao.class);



    @Override
    public XiuXue get(int xxno) {
        return xiuXueDao.get(xxno);
    }

    @Override
    public List<XiuXue> getAll(int tno) {
        Teacher teacher = teaDao.getTea(tno);
        String xy = teacher.getSsxy();
        return xiuXueDao.getAll(xy);
    }

    @Override
    public void applyXiuxue(XiuXue xiuXue) {
        Student student = stuDao.getSingleStudent(xiuXue.getSno());
        xiuXue.setSname(student.getSname());
        xiuXue.setXy(student.getSxy());
        xiuXueDao.add(xiuXue);
        sqlSession.commit();
    }

    @Override
    public void shenhe(XiuXue xiuXue) {
        Student student = new Student();
        student.setSno(xiuXue.getSno());
        if (xiuXue.getShzt().equals("审核通过")){
            student.setXiuxue("yes");
            stuDao.updateStudent(student);
        }else if (xiuXue.getShzt().equals("审核不通过")){
            student.setXiuxue("no");
            stuDao.updateStudent(student);
        }
        xiuXueDao.update(xiuXue);
        sqlSession.commit();
    }

    @Override
    public void delete(int xxno) {
        xiuXueDao.delete(xxno);
        sqlSession.commit();
    }
}
