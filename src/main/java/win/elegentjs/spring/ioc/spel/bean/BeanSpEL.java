package win.elegentjs.spring.ioc.spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * 演示SpEL引用Bean，属性和方法
 */
@Data
public class BeanSpEL {

    // 注入bean
    @Value("#{animal}")
    private Animal animal;

    // 注入bean的属性
    @Value("#{animal.name}")
    private String animalName;

    // 通过bean的方法调用注入
    @Value("#{animal.getAge()}")
    private String animalAge;
}
