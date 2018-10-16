package service.impl;

import dao.GetSessionFactory;
import dao.LoginDao;
import dao.StuDao;
import dao.TeaDao;
import domain.Student;
import domain.Teacher;
import domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.LoginService;
import service.StuService;

import java.util.List;

public class StuServiceImpl implements StuService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    StuDao stuDao = sqlSession.getMapper(StuDao.class);
    LoginDao loginDao = sqlSession.getMapper(LoginDao.class);
    TeaDao teaDao = sqlSession.getMapper(TeaDao.class);


    @Override
    public List<Student> getAll() {
        return stuDao.getAll();
    }

    @Override
    public void addStudent(Student student) {
        stuDao.addStudent(student);
        User user = new User();
        user.setId(student.getSno());
        user.setPwd("123");
        user.setSf("1");
        loginDao.register(user);
        sqlSession.commit();
    }

    @Override
    public List<Student> getStudent(int tno) {
        List<Student> list;
        Teacher teacher = teaDao.getTea(tno);
        String xy = teacher.getSsxy();
        list = stuDao.getStudent(xy);
        return list;
    }

    @Override
    public void deleteStudent(Student student) {
        stuDao.deleteStudent(student);
        loginDao.delete(student.getSno());
        sqlSession.commit();
    }

    @Override
    public void updateStudent(Student student) {
        stuDao.updateStudent(student);
        sqlSession.commit();
    }

    @Override
    public Student getSingleStudent(int sno) {
        return stuDao.getSingleStudent(sno);
    }

    @Override
    public void dengji(int sno) {
        stuDao.dengji(sno);
        sqlSession.commit();
    }
}