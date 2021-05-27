package win.elegentjs.spring.ioc.lifecycle.postpre;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MonkeySample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MonkeyConfig.class);

        context.close();
    }
}
