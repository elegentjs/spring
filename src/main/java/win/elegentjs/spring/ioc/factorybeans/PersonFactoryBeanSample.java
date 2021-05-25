package win.elegentjs.spring.ioc.factorybeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.beans.Person;
import win.elegentjs.spring.ioc.imports.enables.EnableOrgConfig;
import win.elegentjs.spring.util.ArraysUtil;

@Slf4j
public class PersonFactoryBeanSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonFactoryBeanConfig.class);
        Person p = (Person)context.getBean("personBean");
        PersonFactoryBean factoryBean = (PersonFactoryBean)context.getBean("&personBean");

        log.info(p.toString());
        log.info(factoryBean.toString());
    }
}
