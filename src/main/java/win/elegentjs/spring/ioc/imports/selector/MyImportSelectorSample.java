package win.elegentjs.spring.ioc.imports.selector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.imports.javabeans.OrgConfig;
import win.elegentjs.spring.util.ArraysUtil;

@Slf4j
public class MyImportSelectorSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyImportSelectorConfig.class);
        String[] beanDefinitions = context.getBeanDefinitionNames();

        log.info(ArraysUtil.toString(beanDefinitions));
    }
}
