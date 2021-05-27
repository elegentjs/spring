package win.elegentjs.spring.ioc.lifecycle.initdestroy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.imports.javabeans.OrgConfig;
import win.elegentjs.spring.util.ArraysUtil;

@Slf4j
public class GroupSample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GroupConfig.class);

        context.close();
    }
}
