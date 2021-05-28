package win.elegentjs.spring.ioc.beanpost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public CheckVersionBeanPostProcessor checkVersionBeanPostProcessor() {
        return new CheckVersionBeanPostProcessor();
    }

    @Bean
    public CheckColorBeanPostProcessor checkColorBeanPostProcessor() {
        return new CheckColorBeanPostProcessor();
    }

    @Bean
    public Car car() {
        return new Car();
    }
}
