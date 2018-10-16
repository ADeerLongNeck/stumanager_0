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

    private SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    private SqlSession sqlSession = sqlSessionFactory.openSession();
    private XiuXueDao xiuXueDao = sqlSession.getMapper(XiuXueDao.class);
    private FuXueDao fuXueDao = sqlSession.getMapper(FuXueDao.class);
    private StuDao stuDao = sqlSession.getMapper(StuDao.class);
    private TeaDao teaDao = sqlSession.getMapper(TeaDao.class);


    @Override
    public XiuXue getSingle(int xxno) {
        return xiuXueDao.getSingle(xxno);
    }

    @Override
    public List<XiuXue> get(int sno) {
        return xiuXueDao.get(sno);
    }

    @Override
    public List<XiuXue> getAll(int tno) {
        Teacher teacher = teaDao.getTea(tno);
        String xy = teacher.getSsxy();
        return xiuXueDao.getAll(xy);
    }

    @Override
    public boolean applyXiuxue(XiuXue xiuXue) {
        Student student = stuDao.getSingleStudent(xiuXue.getSno());
        if (student.getXiuxue().equals("yes")){
            return false;
        }else {
            student.setXiuxue("yes");
            stuDao.updateStudent(student);
            xiuXue.setSname(student.getSname());
            xiuXue.setXy(student.getSxy());
            xiuXueDao.add(xiuXue);
            sqlSession.commit();
            return true;
        }

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
