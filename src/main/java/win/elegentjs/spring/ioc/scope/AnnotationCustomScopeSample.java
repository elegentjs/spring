package win.elegentjs.spring.ioc.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import win.elegentjs.spring.ioc.compos.CustomScopeMyComponent;
import win.elegentjs.spring.ioc.config.PersonConfig;

/**
 * 测试 customer scope bean
 *
 * 分别新建两个线程，在每个线程中分别从spring容器中获取bean实例,
 * 如果打印出来的对象值相等说明是单例
 *
 */
@Slf4j
public class AnnotationCustomScopeSample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        context.getBeanFactory().registerScope(MyThreadScope.THREAD_SCOPE, new MyThreadScope());

        for (int i = 0; i < 2; i ++) {
            new Thread(() -> {
                log.info(Thread.currentThread() + " : " + context.getBean(CustomScopeMyComponent.class));
                log.info(Thread.currentThread() + " : " + context.getBean(CustomScopeMyComponent.class));
            }).start();
        }

    }
}
