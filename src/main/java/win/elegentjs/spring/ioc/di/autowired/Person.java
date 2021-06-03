package win.elegentjs.spring.ioc.di.autowired;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Person类注入两个field, 两个都使用@Autowired注入
 * 一个指定了bean name
 * 另一个未指定，按类型注入
 */
@Data
public class Person {

    @Autowired
    @Qualifier("bird")
    private Bird bird;

    @Autowired
    private Bird anotherBird;
}
