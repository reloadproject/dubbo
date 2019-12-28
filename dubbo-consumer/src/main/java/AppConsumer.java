import com.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("consumer demo start...测试常规服务");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer demo = "+demoService);
        System.out.println(demoService.getPermissions(1L));
    }
}
