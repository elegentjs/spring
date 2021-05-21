package win.elegentjs.spring.ioc.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义Scope, 期望能满足线程内单例
 */
public class MyThreadScope implements Scope {

    // 定义scope常量，用于@Scope注解scopeName属性引用
    public static final String THREAD_SCOPE = "thread";

    // 初始化ThreadLocal，用于存储线程变量
    private static final ThreadLocal<Map<String, Object>> threadBeanMap = ThreadLocal.withInitial(HashMap::new);

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object bean = threadBeanMap.get().get(name);

        if (bean == null) {
            bean = objectFactory.getObject();
            threadBeanMap.get().put(name, bean);
        }

        return bean;
    }

    @Override
    public Object remove(String name) {
        return threadBeanMap.get().remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        // Nothing to do.
    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return Thread.currentThread().getName();
    }
}
