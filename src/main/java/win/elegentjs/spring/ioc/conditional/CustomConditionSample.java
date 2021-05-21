package win.elegentjs.spring.ioc.conditional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.compos.CustomScopeMyComponent;
import win.elegentjs.spring.ioc.conditional.config.CustomConditionConfig;
import win.elegentjs.spring.ioc.config.PersonConfig;
import win.elegentjs.spring.ioc.scope.MyThreadScope;

/**
 * 测试 customer Condition
 */
@Slf4j
public class CustomConditionSample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomConditionConfig.class);
        boolean myMacOs = context.containsBean("myMacOs");
        boolean myWindowsOs = context.containsBean("myWindowsOs");

        log.info("==> myMacOs: " + myMacOs);
        log.info("==> myWindowsOs: " + myWindowsOs);
    }
}
