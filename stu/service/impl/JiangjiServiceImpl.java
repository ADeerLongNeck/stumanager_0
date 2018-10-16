package service.impl;

import dao.*;
import domain.Jiangji;
import domain.Student;
import domain.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.JiangjiService;

import java.util.List;

public class JiangjiServiceImpl implements JiangjiService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    JiangjiDao jiangjiDao = sqlSession.getMapper(JiangjiDao.class);
    StuDao stuDao = sqlSession.getMapper(StuDao.class);
    TeaDao teaDao = sqlSession.getMapper(TeaDao.class);

    @Override
    public void applyJiangji(Jiangji jiangji) {
        jiangjiDao.add(jiangji);
        sqlSession.commit();
    }

    @Override
    public void requireJiangji(Jiangji jiangji) {
        jiangjiDao.add(jiangji);
        sqlSession.commit();
    }

    @Override
    public void shenhe(Jiangji jiangji) {
        Student student = stuDao.getSingleStudent(jiangji.getSno());
        if (jiangji.getShzt().equals("审核通过")) {
            student.setNj(student.getNj() - 1);
            stuDao.updateStudent(student);
        }
        sqlSession.commit();
    }

    @Override
    public void queren(Jiangji jiangji) {
        Student student = stuDao.getSingleStudent(jiangji.getSno());
        student.setNj(student.getNj() - 1);
        stuDao.updateStudent(student);
        jiangjiDao.update(jiangji);
        sqlSession.commit();
    }

    @Override
    public void delete(int sno) {
        jiangjiDao.delete(sno);
        sqlSession.commit();
    }

    @Override
    public List<Jiangji> getAll(int tno) {
        Teacher teacher = teaDao.getTea(tno);
        String xy = teacher.getSsxy();
        return jiangjiDao.getAll(xy);
    }

    @Override
    public Jiangji get(int sno) {
        return jiangjiDao.get(sno);
    }
}
