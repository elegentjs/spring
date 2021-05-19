package win.elegentjs.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.beans.Person;
import win.elegentjs.spring.ioc.config.PersonConfig;

/**
 * 基于注解方式加载bean
 */
@Slf4j
public class AnnotationBeanSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        Person p = context.getBean(Person.class);

        log.info("person: {}", p);

    }
}
