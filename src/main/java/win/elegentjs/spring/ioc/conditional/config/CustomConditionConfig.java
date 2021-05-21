package win.elegentjs.spring.ioc.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import win.elegentjs.spring.ioc.conditional.EnableMacCondition;
import win.elegentjs.spring.ioc.conditional.EnableWindowsCondition;

/**
 * 通过自定义Condition加载bean
 * 两个bean方法加载了@Conditional注解，容器启动时自动根据当前条件是否满足从而决定是否加载对应的bean
 */
@Configuration
public class CustomConditionConfig {

    @Bean
    @Conditional(EnableMacCondition.class)
    public String myMacOs() {
        return "mac";
    }

    @Bean
    @Conditional(EnableWindowsCondition.class)
    public String myWindowsOs() {
        return "windows";
    }
}
