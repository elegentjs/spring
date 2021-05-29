package win.elegentjs.spring.ioc.beanpost.appware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 持有容器类工具类，方便从容器中获取Bean对象
 */
public class SpringContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }

    /**
     * 从容器中获取Bean
     */
    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

}
