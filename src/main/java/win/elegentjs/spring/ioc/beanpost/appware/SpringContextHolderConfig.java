package win.elegentjs.spring.ioc.beanpost.appware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java config配置类
 */
@Configuration
public class SpringContextHolderConfig  {

    /**
     * 定义Bean，在容器初始化bean的某个阶段注入容器对象
     */
    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
