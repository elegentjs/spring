package win.elegentjs.spring.ioc.propertysource;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:application.properties"})
@ToString
public class MyPropertySourceConfig {

    @Value("${weather}")
    private String weather;

    @Value("${wind}")
    private Integer wind;
}
