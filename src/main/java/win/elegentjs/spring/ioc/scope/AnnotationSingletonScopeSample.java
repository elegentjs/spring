package win.elegentjs.spring.ioc.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.compos.MyComponent;
import win.elegentjs.spring.ioc.config.PersonConfig;

/**
 * 测试单例bean
 */
@Slf4j
public class AnnotationSingletonScopeSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        MyComponent myComponent1 = context.getBean("myComponent", MyComponent.class);
        MyComponent myComponent2 = context.getBean("myComponent", MyComponent.class);

        System.out.println(myComponent1 == myComponent2);


    }
}
