package win.elegentjs.spring.ioc.lifecycle.postpre;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 定义了一个Monkey类，此类比较特殊，我们将混合三种初始化和销毁方法，看看
 * 执行的顺序到底是怎么样的
 */
@Data
@Slf4j
public class Monkey implements InitializingBean, DisposableBean {

    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("==> in Monkey afterPropertiesSet method.");

    }

    @Override
    public void destroy() throws Exception {
        log.info("==> in Monkey destroy method.");

    }

    public void initMethod() {
        log.info("==> in Monkey initMethod method.");
    }

    public void destroyMethod() {
        log.info("==> in Monkey destroyMethod method.");
    }

    @PostConstruct
    public void postConstructor() {
        log.info("==> in Monkey postConstructor method.");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("==> in Monkey preDestroy method.");
    }



}
