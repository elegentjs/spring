package win.elegentjs.spring.ioc.di.autowired;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class AutowiredSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);

        Person p = context.getBean(Person.class);

        log.info("==> p: {}", p);
    }
}
