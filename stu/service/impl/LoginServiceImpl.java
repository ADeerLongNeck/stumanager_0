package service.impl;

import dao.GetSessionFactory;
import dao.JiangjiDao;
import dao.LoginDao;
import domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.LoginService;

public class LoginServiceImpl implements LoginService {

    SqlSessionFactory sqlSessionFactory = GetSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    LoginDao loginDao = sqlSession.getMapper(LoginDao.class);

    @Override
    public boolean login(User user) {
        String pwd = loginDao.login(user.getId());
        if (user.getPwd().equals(pwd)) return true;
        return false;
    }

    @Override
    public void register(User user) {
        loginDao.register(user);
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
