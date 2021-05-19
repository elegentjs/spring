package win.elegentjs.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import win.elegentjs.spring.ioc.beans.Person;

/**
 * 基于xml方式加载bean
 */
@Slf4j
public class XmlBeanSample {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person p = context.getBean("person", Person.class);

        log.info("person: {}", p);

    }
}
