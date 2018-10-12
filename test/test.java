import domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import service.StuService;
import service.impl.StuServiceImpl;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static javafx.scene.input.KeyCode.X;

public class test {

    public static void main(String[] args){
        Student student = new Student();
        student.setSname("jc3");
        student.setSno(123);
        student.setBydate("123");
        student.setCsdate("2018");
        student.setExtra("无");
        student.setJhr("j");
        student.setJtzz("jining");
        student.setPhone("15288877971");
        student.setSfzno("370882199709082812");
        student.setSex("nan");
        student.setMz("汉族");
        student.setZzmm("团员");
        student.setRxdate("201612");
        student.setSxy("信息学院");
        student.setSzy("计算机");
        StuService stuService = new StuServiceImpl();
        stuService.addStudent(student);
        List list = stuService.getStudent();
        for (Object item : list) {
            System.out.println(item.toString());
        }
    }

}
