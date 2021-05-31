package win.elegentjs.spring.ioc.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerValueConfig {

    @Bean
   public CustomerValue customerValue() {
       return new CustomerValue();
   }

   @Bean
   public Animal animal() {
        Animal animal = new Animal();
        animal.setName("dog");
        return animal;
   }
}
