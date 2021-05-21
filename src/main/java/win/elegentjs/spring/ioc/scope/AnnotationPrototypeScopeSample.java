package win.elegentjs.spring.ioc.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.compos.MyComponent;
import win.elegentjs.spring.ioc.compos.PrototypeMyComponent;
import win.elegentjs.spring.ioc.config.PersonConfig;

/**
 * 测试 prototype bean
 */
@Slf4j
public class AnnotationPrototypeScopeSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        // 初始化spring容器后，分别获取两次组件bean，看是否相等
        PrototypeMyComponent component1 = context.getBean(PrototypeMyComponent.class);
        PrototypeMyComponent component2 = context.getBean(PrototypeMyComponent.class);

        System.out.println(component1 == component2);


    }
}
