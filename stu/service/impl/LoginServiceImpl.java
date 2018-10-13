package service.impl;

import dao.*;
import domain.Student;
import domain.Teacher;
import domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.LoginService;

public class LoginServiceImpl implements LoginService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    LoginDao loginDao = sqlSession.getMapper(LoginDao.class);
    StuDao stuDao = sqlSession.getMapper(StuDao.class);
    TeaDao teaDao = sqlSession.getMapper(TeaDao.class);

    @Override
    public boolean login(User user) {
        String pwd = loginDao.login(user.getId());
        if (user.getPwd().equals(pwd)) return true;
        return false;
    }

    @Override
    public void register(User user) {
        loginDao.register(user);
        if (user.getSf().equals("1")){
            Student student = new Student();
            student.setSno(user.getId());
            stuDao.addStudent(student);
        }else if (user.getSf().equals("2")){
            Teacher teacher = new Teacher();
            teacher.setTno(user.getId());
            teaDao.addTea(teacher);
        }

        sqlSession.commit();
    }

    @Override
    public void delete(int id) {
        loginDao.delete(id);
        sqlSession.commit();
    }

    @Override
    public void update(User user) {
        loginDao.update(user);
        sqlSession.commit();
    }
}
