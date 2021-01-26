import com.bingo.fy.aspect.IocManager;
import com.bingo.fy.service.IService;
import com.bingo.fy.service.impl.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopTest {
	public static void main(String[] args) throws Exception
	{
		String data = "abc";
		ApplicationContext atc = new AnnotationConfigApplicationContext(IocManager.class);
		IService srv = atc.getBean(IService.class);
		System.out.println("Aspect result:" + srv.doService(data));

	}
}
