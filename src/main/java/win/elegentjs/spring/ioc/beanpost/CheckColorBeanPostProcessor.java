package win.elegentjs.spring.ioc.beanpost;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * 自定义BeanPostProcessor，实现了Ordered接口可设定后置处理器的执行顺序，值越小越先执行
 */
@Slf4j
public class CheckColorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("==> in CheckColorBeanPostProcessor beforeInitialization method.");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("==> in CheckColorBeanPostProcessor afterInitialization method.");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
