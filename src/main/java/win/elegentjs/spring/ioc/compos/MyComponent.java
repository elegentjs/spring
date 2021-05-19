package win.elegentjs.spring.ioc.compos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Autowired
    private MyComponent myComponent;

    @Override
    public String toString() {
        return "this is a component.";
    }
}
