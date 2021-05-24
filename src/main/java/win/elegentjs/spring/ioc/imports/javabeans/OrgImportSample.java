package win.elegentjs.spring.ioc.imports.javabeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.util.ArraysUtil;

@Slf4j
public class OrgImportSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OrgConfig.class);
        String[] beanDefinitions = context.getBeanDefinitionNames();

        log.info(ArraysUtil.toString(beanDefinitions));
    }
}
