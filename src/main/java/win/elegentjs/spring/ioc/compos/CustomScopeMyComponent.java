package win.elegentjs.spring.ioc.compos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import win.elegentjs.spring.ioc.scope.MyThreadScope;

/**
 * 演示设置bean 作用域为自定义的ThreadScope，即同线程中获取的Bean是单例的
 */
@Component
@Scope(scopeName = MyThreadScope.THREAD_SCOPE)
public class CustomScopeMyComponent {

    @Override
    public String toString() {
        return super.toString();
    }
}
