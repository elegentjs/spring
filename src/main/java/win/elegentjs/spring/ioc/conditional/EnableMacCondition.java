package win.elegentjs.spring.ioc.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 自定义condition，实现根据OS环境启动对应的组件才加载
 */
public class EnableMacCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取当前的环境信息
        Environment environment = context.getEnvironment();
        String os = environment.getProperty("os.name");

        return os.contains("Mac");
    }
}
