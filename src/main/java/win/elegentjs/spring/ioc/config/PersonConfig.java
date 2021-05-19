package win.elegentjs.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import win.elegentjs.spring.ioc.beans.Person;

@Configuration
@ComponentScan(basePackages = "win.elegentjs")
public class PersonConfig {

    @Bean
    public Person myPerson() {
        return new Person("张三", 30);
    }
}
