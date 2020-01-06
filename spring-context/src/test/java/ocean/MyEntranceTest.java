package ocean;

import org.junit.Test;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEntranceTest {

	@Test
	public void beginning() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Worker.xml");
//		ApplicationContext context = new AutowireCapableBeanFactory();
		if (context == null) {
			System.out.println("容器启动失败");
			return;
		}

		Worker worker = context.getBean("worker", Worker.class);
		System.out.println(worker.toString());
	}
}
