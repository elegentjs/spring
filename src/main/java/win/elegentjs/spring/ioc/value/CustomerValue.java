package win.elegentjs.spring.ioc.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

@Data
public class CustomerValue {

    @Value("panda")
    private String name;

    @Value("#{systemProperties['os.name']}")
    private String os;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{animal.name}")
    private String animalName;

    @Value("classpath:application.properties")
    private Resource classpathResource;

    @Value("https://baidu.com")
    private Resource urlResource;
}
