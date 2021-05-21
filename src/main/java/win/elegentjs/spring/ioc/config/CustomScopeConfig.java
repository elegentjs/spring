package win.elegentjs.spring.ioc.config;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import win.elegentjs.spring.ioc.scope.MyThreadScope;

/**
 * 通过CustomScopeConfigurer配置自定义Scope
 */
@Configuration
public class CustomScopeConfig {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope(MyThreadScope.THREAD_SCOPE, new MyThreadScope());

        return configurer;
    }
}
