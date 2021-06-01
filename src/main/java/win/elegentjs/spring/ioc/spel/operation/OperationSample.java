package win.elegentjs.spring.ioc.spel.operation;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class OperationSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OperationConfig.class);
        Operation operation = context.getBean(Operation.class);

        log.info("==> operation: {}", operation);
    }
}
