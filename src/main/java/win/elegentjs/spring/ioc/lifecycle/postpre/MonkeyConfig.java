package win.elegentjs.spring.ioc.lifecycle.postpre;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java config类，初始化Monkey bean实例。
 */
@Configuration
public class MonkeyConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Monkey monkey() {
        return new Monkey();
    }

}
