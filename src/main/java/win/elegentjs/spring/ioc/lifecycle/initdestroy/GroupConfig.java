package win.elegentjs.spring.ioc.lifecycle.initdestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GroupConfig {

    @Bean(initMethod = "init")
    public Group group() {
        return new Group();
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public Group group2() {
        return new Group();
    }
}
