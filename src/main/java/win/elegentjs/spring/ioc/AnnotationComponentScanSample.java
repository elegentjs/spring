package win.elegentjs.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.compos.MyComponent;
import win.elegentjs.spring.ioc.config.PersonConfig;
import win.elegentjs.spring.util.ArraysUtil;

/**
 * 基于Annotation配置componentScan方式加载bean
 */
@Slf4j
public class AnnotationComponentScanSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        String[] beanDefinitions = context.getBeanDefinitionNames();
        log.info("beanDefinitions: {}", ArraysUtil.toString(beanDefinitions));

        MyComponent myComponent = context.getBean("myComponent", MyComponent.class);

        System.out.println(myComponent);


    }
}
