package win.elegentjs.spring.ioc.compos;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 演示设置bean 作用域为原型，即每次从容器中获取组件实例时都是新new出来的
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeMyComponent {

    @Override
    public String toString() {
        return "this is a PrototypeMyComponent.";
    }
}
