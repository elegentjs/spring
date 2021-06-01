package win.elegentjs.spring.ioc.spel.literal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LiteralConfig {

    @Bean
    public Literal sample() {
        return new Literal();
    }
}
