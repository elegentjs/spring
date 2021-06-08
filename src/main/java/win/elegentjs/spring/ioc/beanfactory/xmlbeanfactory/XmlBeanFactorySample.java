package win.elegentjs.spring.ioc.beanfactory.xmlbeanfactory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import win.elegentjs.spring.ioc.beans.Person;

@Slf4j
public class XmlBeanFactorySample {


    public static void main(String[] args) {
        // 使用XmlBeanFactory容器
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Person p = beanFactory.getBean(Person.class);

        log.info("==> p: {}", p);

        // 使用DefaultListableBeanFactory容器结合XmlBeanDefinitionReader
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

        p = factory.getBean(Person.class);

        log.info("==> p: {}", p);


    }
}
