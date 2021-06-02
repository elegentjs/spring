package win.elegentjs.spring.ioc.spel.collection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class PersonSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        Person p = context.getBean(Person.class);

        log.info("==> p: {}", p);
    }

}
