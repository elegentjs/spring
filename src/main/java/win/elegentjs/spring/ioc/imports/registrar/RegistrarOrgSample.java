package win.elegentjs.spring.ioc.imports.registrar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.util.ArraysUtil;

@Slf4j
public class RegistrarOrgSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RegistrarOrgConfig.class);
        String[] beanDefinitions = context.getBeanDefinitionNames();

        log.info(ArraysUtil.toString(beanDefinitions));
    }
}
