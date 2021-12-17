import com.test.bean.Person;
import com.test.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author FH
 * @Date 2021/12/17 15:28
 */
@ContextConfiguration(locations={"file:web/WEB-INF/applicationContext.xml"})
@RunWith(SpringRunner.class)
public class TestSpring {


    @Autowired
    private User user;

    @Autowired
    private Person person;

    @Test
    public void autowiring(){
        System.out.println(1);
    }
}
