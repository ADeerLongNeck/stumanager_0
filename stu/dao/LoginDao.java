package dao;

import domain.User;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {

    String login(@Param("Id") int id,@Param("sf")String sf);

    void register(User user);

    void delete(@Param("Id") int id);

    void update(User user);
}
