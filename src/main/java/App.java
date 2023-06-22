import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        var cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1.getMessage());
        var cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat2.getMessage());

        var isEqualBeans = bean == bean2;
        System.out.println(isEqualBeans);
        System.out.println(bean);
        System.out.println(bean2);
        var isEqualCats = cat1 == cat2;
        System.out.println(isEqualCats);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}