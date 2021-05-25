package win.elegentjs.spring.ioc.factorybeans;

import org.springframework.beans.factory.FactoryBean;
import win.elegentjs.spring.ioc.beans.Person;

/**
 * 自定义的FactoryBean, 返回Person实例
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() {
        return new Person("zhangsan", 20);
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
