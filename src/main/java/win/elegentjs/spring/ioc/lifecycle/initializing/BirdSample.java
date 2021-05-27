package win.elegentjs.spring.ioc.lifecycle.initializing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.lifecycle.initdestroy.GroupConfig;

@Slf4j
public class BirdSample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BirdConfig.class);

        context.close();
    }
}
