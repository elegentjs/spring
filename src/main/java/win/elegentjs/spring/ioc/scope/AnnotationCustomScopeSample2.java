package win.elegentjs.spring.ioc.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.compos.CustomScopeMyComponent;
import win.elegentjs.spring.ioc.config.CustomScopeConfig;
import win.elegentjs.spring.ioc.config.PersonConfig;

/**
 * 测试 customer scope bean
 *
 * 采用CustomScopeConfigurer形式注册自定义Scope
 *
 * 分别新建两个线程，在每个线程中分别从spring容器中获取bean实例,
 * 如果打印出来的对象值相等说明是单例
 *
 */
@Slf4j
public class AnnotationCustomScopeSample2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomScopeConfig.class, PersonConfig.class);

        for (int i = 0; i < 2; i ++) {
            new Thread(() -> {
                log.info(Thread.currentThread() + " : " + context.getBean(CustomScopeMyComponent.class));
                log.info(Thread.currentThread() + " : " + context.getBean(CustomScopeMyComponent.class));
            }).start();
        }

    }
}
