import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
