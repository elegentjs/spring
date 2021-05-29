package win.elegentjs.spring.ioc.beanpost.appware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SpringContextHolderSample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringContextHolderConfig.class);

        SpringContextHolderConfig config = SpringContextHolder.getBean(SpringContextHolderConfig.class);

        log.info("==> config: {}", config);
    }
}
