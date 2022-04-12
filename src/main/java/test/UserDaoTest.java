package test;

import com.zhu.bean.User;
import com.zhu.dao.UserDao;
import com.zhu.service.impl.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author blueboy
 * @create ***2022-04-2022/4/11***
 */
public class UserDaoTest {

    @Test
    public void testQueryUserList() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService service = (UserService) ac.getBean("userService"); // 因为给service起了别名，所以通过id的方式获取class
        service.findAll();

    }

    @Test
    public void testMybatis() throws IOException {
        InputStream resourceAsStream= Resources.getResourceAsStream("mysqlConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(resourceAsStream);
        SqlSession session=factory.openSession(true);

        UserDao mapper=session.getMapper(UserDao.class);
        List<User> all=mapper.findAll();
        for (User user:all) {
            System.out.println(user);
        }
    }
}
