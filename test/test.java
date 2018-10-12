import domain.FuXue;
import domain.Student;
import domain.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import service.FuXueService;
import service.StuService;
import service.TeaService;
import service.impl.FuXueServiceImpl;
import service.impl.StuServiceImpl;
import service.impl.TeaServiceImpl;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static javafx.scene.input.KeyCode.X;

public class test {

    public static void main(String[] args){
//        Student student = new Student();
//        student.setSname("jc333");
//        student.setSno(2);
//        student.setBydate("123");
//        student.setCsdate("2018");
//        student.setExtra("无");
//        student.setJhr("j");
//        student.setJtzz("jining");
//        student.setPhone("15288877971");
//        student.setSfzno("370882199709082812");
//        student.setSex("nan");
//        student.setMz("汉族");
//        student.setZzmm("团员");
//        student.setRxdate("201612");
//        student.setSxy("信息学院");
//        student.setSzy("计算机");
//        StuService stuService = new StuServiceImpl();
//        stuService.updateStudent(student);

        /*TeaService service = new TeaServiceImpl();
        Teacher teacher = new Teacher();
        teacher.setTno(111);
        teacher.setSsxy("66");
        teacher.setTname("去中锋");
        service.addTea(teacher);
        Teacher teacher1 ;
        teacher1= service.getTea(111);
        System.out.println(teacher1.getTname());
        System.out.println(teacher1.getSsxy());*/

//        FuXue fuXue = new FuXue();
//        fuXue.setSno(132);
//        fuXue.setSqdate("2016");
//        fuXue.setShzt("审核通过");
//        FuXueService service = new FuXueServiceImpl();
//        service.applyFuXue(fuXue);
//        service.delete(154);

        /*StuService stuService = new StuServiceImpl();
        List<Student> list = stuService.getStudent();
        for (Student item : list) {
            //  System.out.println(item.toString());
            System.out.print(" <tr>\n" +
                    "                                        <td><a href=\"mamger_table_stu_info.html\">"+item.getSno()+"</a></td>\n" +
                    "                                        <td>"+item.getSname()+"</td>\n" +
                    "                                        <td>"+item.getSxy()+"</td>\n" +
                    "                                        <td>"+item.getSzy()+"</td>\n" +
                    "                                    </tr>");

        }*/

//        Student student = new Student();
//        student.setMz("汉");
//        student.setSno(2);
//        StuService stuService = new StuServiceImpl();
//        stuService.updateStudent(student);


    }

}
