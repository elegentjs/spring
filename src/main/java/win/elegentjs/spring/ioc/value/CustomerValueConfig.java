package win.elegentjs.spring.ioc.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java config 配置类，定义了两个bean,animal会被customerValue依赖
 */
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
