package win.elegentjs.spring.ioc.spel.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Animal animal() {
        Animal animal = new Animal();
        animal.setName("fox");
        animal.setAge(2);
        return animal;
    }

    @Bean
    public BeanSpEL bean() {
        return new BeanSpEL();
    }
}
