package win.elegentjs.spring.ioc.factorybeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义的FactoryBeanConfig，加载factoryBean至容器
 *
 * 从容器中通过getBean获取到的对象不是PersonFactoryBean本身，
 * 而是PersonFactoryBean的getObject()方法返回的对象
 *
 */
@Configuration
public class PersonFactoryBeanConfig {

    @Bean
    public PersonFactoryBean personBean() {
        return new PersonFactoryBean();
    }
}
