package service.impl;

import dao.GetSessionFactory;
import dao.StuDao;
import domain.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.StuService;

import java.util.List;

public class StuServiceImpl implements StuService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    StuDao stuDao = sqlSession.getMapper(StuDao.class);


    @Override
    public void addStudent(Student student) {
        stuDao.addStudent(student);
        sqlSession.commit();
    }

    @Override
    public List<Student> getStudent() {
        List<Student> list;
        list = stuDao.getStudent();
        return list;
    }

    @Override
    public void deleteStudent(Student student) {

        stuDao.deleteStudent(student);
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
}
