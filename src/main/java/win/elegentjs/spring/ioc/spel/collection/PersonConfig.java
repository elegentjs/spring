package win.elegentjs.spring.ioc.spel.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person person() {
        Person p = new Person();

        return p;
    }
}
