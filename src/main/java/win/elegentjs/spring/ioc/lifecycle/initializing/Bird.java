package win.elegentjs.spring.ioc.lifecycle.initializing;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 一个简单的bean定义类，我们实现类三个接口，一个是会执行初始化方法，一个是bean销毁前执行，还有一个是注入容器类
 */
@Data
@Slf4j
public class Bird implements InitializingBean, DisposableBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private String name;

    @Override
    public void destroy() throws Exception {
        log.info("==> in destroy method.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("==> in afterPropertiesSet method.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("==> in setApplicationContext method.");

        this.applicationContext = applicationContext;
    }
}
