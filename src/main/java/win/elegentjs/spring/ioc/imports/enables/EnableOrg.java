package win.elegentjs.spring.ioc.imports.enables;

import org.springframework.context.annotation.Import;
import win.elegentjs.spring.ioc.imports.selector.MyImportSelector;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(MyImportSelector.class)
public @interface EnableOrg {

}
