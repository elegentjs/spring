package win.elegentjs.spring.ioc.propertysource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MyPropertySourceSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyPropertySourceConfig.class);
        MyPropertySourceConfig config = context.getBean(MyPropertySourceConfig.class);

        log.info("==> config: {}", config);
    }
}
