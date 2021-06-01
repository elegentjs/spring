package win.elegentjs.spring.ioc.spel.literal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class LiteralSample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LiteralConfig.class);
        Literal literal = context.getBean(Literal.class);

        log.info("==> literal: {}", literal);
    }
}
