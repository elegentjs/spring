package win.elegentjs.spring.ioc.spel.operation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OperationConfig {

    @Bean
    public Operation operation() {
        return new Operation();
    }

}
