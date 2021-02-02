import com.bingo.fy.aspect.IocManager;
import com.bingo.fy.service.IService;
import com.bingo.fy.service.impl.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopTest {
	public static void main(String[] args) throws Exception
	{
		String data = "abc";
		AnnotationConfigApplicationContext atc = new AnnotationConfigApplicationContext(IocManager.class);
		//相当于从map中获取的值(singletonObjects是一个ConcurrentHashMap)
		IService srv =(IService) atc.getBean("c");
		//其实拿不到这个ServiceImpl.class这个类;
		//IService srv =(IService) atc.getBean(ServiceImpl.class);
		System.out.println("Aspect result:" + srv.doService(data));

	}
}
