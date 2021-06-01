package win.elegentjs.spring.ioc.spel.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示SpEL引用Bean，属性和方法
 */
@Slf4j
public class BeanSpELSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        BeanSpEL beanSpEL = context.getBean(BeanSpEL.class);

        log.info("==> beanSpEL: {}", beanSpEL);
    }
}
