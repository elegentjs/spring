package win.elegentjs.spring.ioc.value;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class CustomerValueSample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomerValueConfig.class);

        CustomerValue customerValue = context.getBean(CustomerValue.class);

        log.info("==> customerValue: {}", customerValue);

    }
}
