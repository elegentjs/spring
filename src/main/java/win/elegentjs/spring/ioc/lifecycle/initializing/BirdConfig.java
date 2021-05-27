package win.elegentjs.spring.ioc.lifecycle.initializing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java config类，初始化Bird bean实例。
 */
@Configuration
public class BirdConfig {

    @Bean
    public Bird bird() {
        return new Bird();
    }

}
