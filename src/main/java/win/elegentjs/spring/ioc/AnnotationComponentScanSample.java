package win.elegentjs.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ArraysUtil;
import win.elegentjs.spring.ioc.config.PersonConfig;

/**
 * 基于Annotation配置componentScan方式加载bean
 */
@Slf4j
public class AnnotationComponentScanSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        String[] beanDefinitions = context.getBeanDefinitionNames();
        log.info("beanDefinitions: {}", ArraysUtil.toString(beanDefinitions));

    }
}
