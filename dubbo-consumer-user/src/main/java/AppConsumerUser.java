import com.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumerUser {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("consumer user start");
        UserService userService = context.getBean(UserService.class);
        System.out.println("consumer user");
        System.out.println(userService.getName("1"));
    }
}
