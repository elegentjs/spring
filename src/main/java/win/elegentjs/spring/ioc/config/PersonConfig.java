package win.elegentjs.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import win.elegentjs.spring.ioc.beans.Person;
import win.elegentjs.spring.ioc.typefilter.MyTypeFilter;

@Configuration
@ComponentScan(basePackages = "win.elegentjs", useDefaultFilters = false, includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
})
public class PersonConfig {

    @Bean
    public Person myPerson() {
        return new Person("张三", 30);
    }
}
