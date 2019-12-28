import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AppProvider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context.getDisplayName() + ":here");
        System.out.println("-----开始提供服务-----");
		context.start();
		System.out.println("provider start......");
		System.in.read();
		//org.apache.curator.RetryPolicy retryPolicy = new org.apache.curator.RetryPolicy();
	}
}
