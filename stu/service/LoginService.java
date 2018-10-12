package service;

import domain.User;
import org.apache.ibatis.annotations.Param;

public interface LoginService {

    boolean login(User user);

    void register(User user);

    void delete(int id);

    void update(User user);
}
