package win.elegentjs.spring.ioc.di.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * java config配置类
 */
@Configuration
public class AutowiredConfig {

    /**
     * 定义bean name 为bird的bean
     */
    @Bean
    public Bird bird() {
        Bird b = new Bird();
        b.setName("鹦鹉");

        return b;
    }

    /**
     * 定义bean name 为bird2的bean，标注了@Primary。当按类型注入该bean时会优先注入
     */
    @Bean
    @Primary
    public Bird bird2() {
        Bird b = new Bird();
        b.setName("鹦鹉2");

        return b;
    }

    @Bean
    public Person person() {
        return new Person();
    }
}
