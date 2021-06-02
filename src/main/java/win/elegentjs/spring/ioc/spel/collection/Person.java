package win.elegentjs.spring.ioc.spel.collection;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

@Data
public class Person {

    @Value("#{{1,2,3}}")
    private List<Integer> cards;

    @Value("#{{1,2,3}[0]}")
    private Integer first;

    @Value("#{{'name': 'zhangsan', 'age': 20}}")
    private Map<String, Object> dict;

    @Value("#{{'name': 'zhangsan', 'age': 20}['name']}")
    private String dictName;

}
